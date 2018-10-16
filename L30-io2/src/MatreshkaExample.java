import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class MatreshkaExample {

	
	public static void main(String[] args) throws Exception {
		InputStream is = new DataInputStream(new BufferedInputStream(new FileInputStream("file.txt")));
		
		new Scanner(is);
		DataInputStream dis = (DataInputStream) is;
		dis.readInt();
	}
}

























