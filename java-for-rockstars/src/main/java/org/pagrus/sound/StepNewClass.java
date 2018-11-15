package org.pagrus.sound;

import java.io.File;
import java.util.stream.Stream;

public class StepNewClass {
	
	public static double dToD(double d) {
		return d;
	}
	
	public static void main(String[] args) {
		Stream<File> strFiles = null;
		Stream<String> strString = null;
		
		strString = strFiles.map(f -> f.getAbsolutePath());
		//strString = strFiles.map(File::getAbsolutePath());
	}
	
}
