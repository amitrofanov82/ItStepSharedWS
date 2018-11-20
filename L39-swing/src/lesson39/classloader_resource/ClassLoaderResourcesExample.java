package lesson39.classloader_resource;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class ClassLoaderResourcesExample {
	
	public static void main(String[] args) throws Exception {
		new ClassLoaderResourcesExample().objectMain();
		
		//static way to get classloades:
		ClassLoaderResourcesExample.class.getClassLoader();
	}
	
	public void objectMain() throws Exception {
		File f1 = new File("file1.txt");
		//File f2 = new File("src/lesson39/some_package/file2.txt");
		
		//ClassLoader cl = ClassLoader.getSystemClassLoader();
		ClassLoader cl = this.getClass().getClassLoader();
		
		InputStream f2in = cl.getResourceAsStream(
				"lesson39/some_package/file2.txt");
		
		
		
		
		FileReader fr1 = new FileReader(f1);
		Reader fr2 = new InputStreamReader(f2in);
		
		char[] content1 = new char[10];
		char[] content2 = new char[10];
		
		fr1.read(content1);
		fr2.read(content2);
		
		System.out.println(content1);
		System.out.println(content2);
		
	}
}
