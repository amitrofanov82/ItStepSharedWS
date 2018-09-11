package examples21.interfaces;

public interface CelestialBody {
	
	public static double G = 9.81;
	
	void setHeight(int heightInMeters);
	
	String fall();
	
}
