package lesson29.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public class IOStreams {
	
	public static void main(String[] args) throws IOException {
		File f = new File("ourFile");
		InputStream fis = new FileInputStream(f);
		
		//InputStream fis = new FileInputStream("ourFile");
		/*while (true){
			if (Math.random() < 0.000000001) {
				System.out.println("I'm alive");
			}
			if (Math.random() < 0.000000001) {
				System.out.println("closed");
				fis.close();
			}
		}*/
		
		
		/*byte[] fileContent = new byte[(int) f.length()];
		fis.read(fileContent);
		
		String fileContentAsString = new String(fileContent, Charset.forName("Cp1255"));
		System.out.println(fileContentAsString);
		System.out.println(f.toString());*/
		
		List<Byte> fileContent = new ArrayList<>();
		int byteValue;
		while ((byteValue = fis.read()) != -1){
			fileContent.add((byte) byteValue);
		}
		Byte[] bArray = new Byte[fileContent.size()];
		String fileContentAsString = 
				new String();
		System.out.println(fileContentAsString);
		
		
		OutputStream fos = new FileOutputStream("newFileTorWrite");
		for (int i =65; i< 100; i++){
			fos.write(i);
		}

		
		
		//InputStream iis = null;// SomeInternatClass.someMethod("http://tut.by")
		
		


		
	}
	
	
}























