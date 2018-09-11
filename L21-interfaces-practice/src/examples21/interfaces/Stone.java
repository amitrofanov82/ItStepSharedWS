package examples21.interfaces;

public class Stone implements CelestialBody {

	@Override
	public void setHeight(int heightInMeters) {
		System.out.println("мне пофиг с какой высоты падать");
	}

	@Override
	public String fall() {
		return "ну упал, пофиг";
	}

}
