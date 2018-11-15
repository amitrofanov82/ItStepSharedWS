package org.pagrus.sound;

import gnu.trove.list.array.TDoubleArrayList;

import java.util.function.Consumer;
import java.util.function.DoubleUnaryOperator;
import java.util.stream.DoubleStream;

import org.pagrus.sound.effects.Amplifier;
import org.pagrus.sound.effects.ClippingDistorion;
import org.pagrus.sound.effects.Flanger;
import org.pagrus.sound.effects.Normalizer;
import org.pagrus.sound.plumbing.StereoOut;

public class SoundProcessor {
  private static final int DEFAULT_BUFFER_SIZE = 256;

  private double[] sniffedSamples;
  private Consumer<double[]> sniffer = d -> {};
  private TDoubleArrayList sniffedSamplesList;

  private Normalizer preNormalizer = new Normalizer(0.2);
  private ClippingDistorion distortion = new ClippingDistorion(0.05, 0, 2);
  private Amplifier postAmp = new Amplifier(3);
  private Flanger flanger = new Flanger(200, 200, 2, 1, 2);

  public SoundProcessor() {
    updateBufferSize(DEFAULT_BUFFER_SIZE);
  }

  /**
   * May potentially get invoked by the sound system
   */
  public void updateBufferSize(int bufferSize) {
    sniffedSamples = new double[bufferSize];
    sniffedSamplesList = TDoubleArrayList.wrap(sniffedSamples);
  }

  /**
   * Process a single buffer of sound samples and write results to<code>out</code>. 
   * @param sampleTime system nano time associated with the samples.
   */
  public void processBuffer(DoubleStream inputSamples, 
		  StereoOut out, long sampleTime) {
    sniffedSamplesList.reset();

    //inputSamples.mapToObj(d -> new Amplifier(2));
    
    inputSamples
    	.map(preNormalizer::apply)
    	//.map(flanger::apply)
	    //.map(distortion::apply)
    	.map(x -> 2 * Math.signum(x) * (Math.min(Math.abs(x), 0.05)) + x * 0)
	    .map(postAmp::apply)
	    .peek(sniffedSamplesList::add)
	    .forEach(out :: putSample);
    	//filter(el -> boolean)
    	//collect(Collector.toList());
    sniffer.accept(sniffedSamples);
    
	  /*.map((d) -> {return d;})
	  .map(new DoubleUnaryOperator(){

				@Override
				public double applyAsDouble(double operand) {
					return operand;
				}
		  
	  		})
	  .map(d -> StepNewClass.dToD(d))
	  .map(StepNewClass::dToD)*/
    
  }

  public void setSampleSniffer(Consumer<double[]> sniffer) {
    this.sniffer = sniffer;
  }
}
