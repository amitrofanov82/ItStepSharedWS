import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationExample {
	
	public static void main(String[] args) throws Exception {
		//Object o = new File("name.ext");
		//ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("name.ext"));
		//ObjectInputStream in = new ObjectInputStream(new FileInputStream("name.ext"));
		
		//out.writeObject(o);
		
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("name.ext"));
		File f = (File) in.readObject();
		System.out.println(f.getAbsolutePath());
	}
	
}
