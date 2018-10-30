package lesson34.nontransientrecusrsivefield;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class AppMain {
	
	public static void main(String[] args) throws Exception {
		Object o = new Serializable1();
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("fname.txt"));
		out.writeObject(o);
		out.flush();
		out.close();
		System.out.println("finish");
	}
	
	
}
