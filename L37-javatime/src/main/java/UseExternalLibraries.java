import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;


public class UseExternalLibraries {
	
	public static void main(String[] args) {
		List<String> fileContent = null;
		try {
			fileContent = FileUtils.readLines(new File("pom.xml"), "UTF8");
		} catch (IOException e) {
			System.err.println("cant read file");
		}
		System.out.println(fileContent);
	}
	
}
