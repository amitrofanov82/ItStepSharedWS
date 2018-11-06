package lesson35.datetime;

import java.util.Scanner;

public class InputUserClass {

	
	public int checkIntParameter() {
		Scanner input = new Scanner(System.in);
		boolean numberFormatCheck = false;
		int j = 0;
		try {
			String s = input.nextLine();
			j = Integer.parseInt(s);
			numberFormatCheck = true;
		} catch (NumberFormatException e) {
		}
		if (numberFormatCheck == false) {
			throw new InputUserClassExceptions("Entered symbols isn't integer");
		}

		if (j < 0) {
			throw new InputUserClassExceptions("Entered symbols is negative number"
					+ "\nEnter please positive enteger");
		}
		return j;
	}

	public int inputIntParameter() {
		boolean checkParameter = true;
		int d = 0;
		while (checkParameter) {
			try {
				d = checkIntParameter();
				checkParameter = false;
			} catch (InputUserClassExceptions e) {
				System.out.println(e.getMessage());
				System.out.println("try again");
			}
		}
		return d;
	}
	
	public String inputStringParameter() {
		Scanner input = new Scanner(System.in);
		return input.nextLine() ;
	}
}
