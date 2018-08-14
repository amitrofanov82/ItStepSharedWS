package lesson14.objects.privateConstructor;

public class Universum {
	public String razmer;
	public String vozrast;
	private static Universum instance;
	
	private Universum(){
		razmer = "beskonechnost'";
		vozrast = "vechnost'";
	}
	
	public static Universum getInstance(){
	//public static Universum createUniversum(){
		if (instance == null) {
			instance = new Universum();
		}
		return instance;
	}
}
