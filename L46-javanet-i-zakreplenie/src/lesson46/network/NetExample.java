package lesson46.network;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class NetExample {
	
	public static void main(String[] args) 
			throws MalformedURLException, IOException {
		URL tutby = new URL("https://tut.by");
		URLConnection conn = tutby.openConnection();
		InputStream is = conn.getInputStream();
		BufferedReader br =  new BufferedReader(new InputStreamReader(conn.getInputStream()));
		
		FileOutputStream fos = new FileOutputStream("tutbysite");
		/*int readByte;
		is.available();
		while((readByte = is.read())  != -1){
			fos.write(readByte);
			System.out.println(readByte);
		}
		fos.flush();*/
		
		
		
		byte[] buffer = new byte[1024];
		int len;
		int size=0;
		while ((len = is.read(buffer)) != -1) {
		    fos.write(buffer, 0, len);
		    System.out.println(len);
		    size+=len;
		}
		fos.flush();
		fos.close();
		is.close();
		System.out.println(size);
		
		/*String nextLine = "";
		while ((nextLine = br.readLine()) != null) {
			System.out.println(nextLine);
		}*/
		
		
		
		
	}
	
}











