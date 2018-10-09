package lesson28.collections2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesExample {
	
	public static void main(String[] args) throws Exception {
		Properties p = new Properties();

		p.load(new FileInputStream("settings.properties"));
		System.out.println(p);
		//p.put("key" + Math.random(), Double.toString(Math.random()));
		//p.store(new FileWriter("settings.properties"), "Comments example");

	}
	
}
