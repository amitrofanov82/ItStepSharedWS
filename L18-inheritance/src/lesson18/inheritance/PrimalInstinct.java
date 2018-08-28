package lesson18.inheritance;

public class PrimalInstinct {
	
	private int x=0, y=0, z=0;
	private int mood = 5; //1-10
	private String kind = "koshka";
	
	public PrimalInstinct(String kind) {
		this.kind = kind;
	}

	public void move(int xStep, int yStep, int zStep){
		x+=xStep;
		y+=yStep;
		z+=zStep;
	}
	
	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public int getMood() {
		return mood;
	}

	public void setMood(int mood) {
		this.mood = mood;
	}
	
	
}
