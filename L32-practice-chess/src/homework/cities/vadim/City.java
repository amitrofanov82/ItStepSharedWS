package homework.cities.vadim;

public class City {

	private String country;
	private String city;
	private String countPeople;
	private String x;
	private String y;
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountPeople() {
		return countPeople;
	}
	public void setCountPeople(String countPeople) {
		this.countPeople = countPeople;
	}
	public String getX() {
		return x;
	}
	public void setX(String x) {
		this.x = x;
	}
	public String getY() {
		return y;
	}
	public void setY(String y) {
		this.y = y;
	}
	
	public int distanceToCity(City secondCity) {
		double x1 = Double.parseDouble(x), y1 = Double.parseDouble(y), x2 = Double.parseDouble(secondCity.x), 
				y2 = Double.parseDouble(secondCity.y);
		double result = 111.2 * Math.sqrt( (x1 - x2)*(x1 - x2) + (y1 - y2)*Math.cos(Math.PI*x1/180)*(y1 - y2)
				*Math.cos(Math.PI*x1/180));
		return (int)(Math.round(result));
	}
	
	
	
	
}
