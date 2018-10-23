package lesson32.examples;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TryWithResources {

	public static void main(String[] args) throws IOException{
		File file = new File("worldcities.txt");
		BufferedWriter answers = new BufferedWriter(new FileWriter("answers.txt"));

		ArrayList<String[]> orderedCities = new ArrayList<>();
		double northestAttitude = 0.0;
		
		/*Scanner scanner = null;
		try {
			scanner = new Scanner(file);
			while (scanner.hasNextLine()) {
				String[] city = scanner.nextLine().split(",");
				if (Integer.parseInt("0" + city[4]) > 73943) {
					orderedCities.add(city);
					//System.out.println(Arrays.toString(city));
				}
			}
		} finally {
			if (scanner != null){
				try {
					scanner.close();
				} catch (Exception e) {
					//log error
					//send email
					//there's nothing more we can do... lets continue
				}
			}
		}*/
		
		try (Scanner scanner = new Scanner(file); 
			 InputStream is = new FileInputStream("")){
			while (scanner.hasNextLine()) {
				String[] city = scanner.nextLine().split(",");
				if (Integer.parseInt("0" + city[4]) > 73943) {
					orderedCities.add(city);
					//System.out.println(Arrays.toString(city));
				}
			}
		}



		String[] southestCityBY = orderedCities.get(0);
		northestAttitude = Double.parseDouble(orderedCities.get(0)[5]);
		for (int i = 0; i < orderedCities.size(); i++) {
			String[] currentCity = orderedCities.get(i);
			if (Double.parseDouble(currentCity[5]) < northestAttitude && currentCity[0].matches("by")) {
				//System.out.println(currentCity[1] + " souther than " + southestCityBY[1]);
				southestCityBY = currentCity;
				northestAttitude = Double.parseDouble(currentCity[5]);
			}
		}
		answers.write("Самый южный город Беларуси, среди городов, население которых больше 73943 человек - " + southestCityBY[2] );
		System.out.println("Самый южный город Беларуси, среди городов, население которых больше 73943 человек- " + southestCityBY[2]);

		String[] northestCityIt = null;
		for (int i = 0; i < orderedCities.size(); i++) {
			String[] currentCity = orderedCities.get(i);
			if (Double.parseDouble(currentCity[6]) <= northestAttitude && currentCity[0].matches("it")) {
				northestCityIt = currentCity;
				northestAttitude = Double.parseDouble(currentCity[6]);
			}
		}
		answers.newLine();
		answers.write("Самый северный город Италии, среди городов, население которых больше 73943 человек - " + northestCityIt[2]);
		System.out.println("Самый северный город Италии, среди городов, население которых больше 73943 человек - " + northestCityIt[2]);
		
		//System.out.println(Arrays.toString(orderedCities));
		for(int i = 0 ; i < orderedCities.size(); i++){
			answers.write(Arrays.toString(orderedCities.get(i)));
			answers.newLine();
		}
		
		answers.flush();
		answers.close();
	}
	
}
