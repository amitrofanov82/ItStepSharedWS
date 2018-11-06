package lesson35.datetime;

import java.util.Scanner;

public class UserInput {
	
	private String userTimeZone = "GMT";
	private int userYear = 2000;
	private int userMonth = 01;
	private int UserDay = 01;
	private String dayOfWeek = "Monday";
	
	
	UserInput (){
		Scanner input = new Scanner (System.in);
		InputUserClass inputIn = new InputUserClass ();
		System.out.println("Please enter time zone you need");
		this.userTimeZone = input.nextLine();
		System.out.println("Please enter the start year");
		this.userYear = inputIn.inputIntParameter();
		System.out.println("Please enter the start month");
		this.userMonth = inputIn.inputIntParameter();
		System.out.println("Please enter the start day");
		this.UserDay = inputIn.inputIntParameter();
		System.out.println("Please enter day of week");
		this.dayOfWeek = input.nextLine();
	}


	public String getDayOfWeek() {
		return dayOfWeek;
	}


	public void setDayOfWeek(String dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}


	public String getUserTimeZone() {
		return userTimeZone;
	}


	public void setUserTimeZone(String userTimeZone) {
		this.userTimeZone = userTimeZone;
	}


	public int getUserYear() {
		return userYear;
	}


	public void setUserYear(int userYear) {
		this.userYear = userYear;
	}


	public int getUserMonth() {
		return userMonth;
	}


	public void setUserMonth(int userMonth) {
		this.userMonth = userMonth;
	}


	public int getUserDay() {
		return UserDay;
	}


	public void setUserDay(int userDay) {
		UserDay = userDay;
	}
	
	


}
