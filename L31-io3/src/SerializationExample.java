import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationExample {
	
	public static void main(String[] args) throws Exception {
		//new File("nashKlassKakFile.ext").delete();
		//Serializable o = new ClassToSaveAsBytes();
		//serializeSomething(o);
		
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("nashKlassKakFile.ext"));
		//ClassToSaveAsBytes
		ClassToSaveAsBytes f = (ClassToSaveAsBytes) in.readObject();
		System.out.println(f.randomValue);
	}
	
	
	public static void serializeSomething (Serializable o) throws IOException {

		if (o instanceof Serializable) {
			Serializable ser = (Serializable) o;
			ObjectOutputStream out = 
					new ObjectOutputStream(new FileOutputStream("nashKlassKakFile.ext"));
			out.writeObject(ser);
			System.out.println("ОК");
		} else {
			System.out.println("O несереализуемо");
		}
	}
	
}
