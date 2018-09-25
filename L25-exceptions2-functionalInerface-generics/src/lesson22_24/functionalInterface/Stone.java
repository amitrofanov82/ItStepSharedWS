package lesson22_24.functionalInterface;

public class Stone {
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
	
}
