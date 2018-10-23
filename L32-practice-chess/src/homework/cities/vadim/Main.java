package homework.cities.vadim;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader readFile = new BufferedReader(new FileReader("src/worldcities.txt"));
		BufferedWriter writeFile = new BufferedWriter(new FileWriter("src/worldcitiesSmall.txt"));
		City southCityBy = null;
		City northCityIt = null;
		String line;
		
		while ((line = readFile.readLine()) != null) {
			String[] cityLine = line.split(",");
			City city = new City();
			city.setCountry(cityLine[0]);
			city.setCity(cityLine[2]);
			city.setCountPeople("0" + cityLine[4]);
			city.setX(cityLine[5]);
			city.setY(cityLine[6]);
			if (city.getCountry().equals("by") && Integer.parseInt(city.getCountPeople()) > 73943) {
				if (southCityBy == null) {
					southCityBy = city;
				} else if (Double.parseDouble(southCityBy.getX()) > Double.parseDouble(city.getX())) {
					southCityBy = city;
				}
			}
			if (city.getCountry().equals("it") && Integer.parseInt(city.getCountPeople()) > 73943) {
				if (northCityIt == null) {
					northCityIt = city;
				} else if (Double.parseDouble(northCityIt.getX()) < Double.parseDouble(city.getX())) {
					northCityIt = city;
				}
			}
			if (Integer.parseInt(city.getCountPeople()) > 0) {
				writeFile.write(line);
				writeFile.write(File.separator);
			}
		}
		
		readFile.close();
		writeFile.close();
		System.out.println("Самый южный город Беларуси - " + southCityBy.getCity() + ", с населением " 
				+ Integer.parseInt(southCityBy.getCountPeople()) + " человек");
		System.out.println("Самый северный город Италии - " + northCityIt.getCity() + ", с населением " 
				+ Integer.parseInt(northCityIt.getCountPeople()) + " человек");
		System.out.println("Расстояние между ними - ~" + southCityBy.distanceToCity(northCityIt) + " км");
	}
}
