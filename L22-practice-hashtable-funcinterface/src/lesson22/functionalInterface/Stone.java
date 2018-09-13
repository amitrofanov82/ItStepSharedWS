package lesson22.functionalInterface;

public class Stone implements Sravnivaemyj {
	public double weight;
	public String forma;
	
	public Stone(){
		weight = Math.random()*1000;
		if (Math.random() >0.5) {
			forma = "Oval";
		} else {
			forma = "Cubical";
		}
	}

	@Override
	public String toString() {
		return (forma.equals("Oval") ? "овальный ":"неовальный ") 
				+ "камень с весом = " + weight;
	}
	
	@Override
	public int compare(Object o) {
		return (int)(this.weight - ((Stone) o).weight);
	}
	
}
