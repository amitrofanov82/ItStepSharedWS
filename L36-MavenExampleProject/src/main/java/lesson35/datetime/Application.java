package lesson35.datetime;

import java.util.Calendar;
import java.util.TimeZone;

public class Application {

	private InputUserClass input = new InputUserClass();
	private UserInput usersData = new UserInput();
	private Calendar usersCalendar = Calendar.getInstance(TimeZone
			.getTimeZone(usersData.getUserTimeZone()));

	public void start() {

		usersRepeat();
	}

	private void findNextUsersDayOfWeek(String userDay, Calendar usersCalendar) {
		int indexDayOfWeek = 0;
		
		if (userDay.toLowerCase().equalsIgnoreCase("mon"))
			indexDayOfWeek = 2;
		if (userDay.toLowerCase().equalsIgnoreCase("tue"))
			indexDayOfWeek = 3;
		if (userDay.toLowerCase().equalsIgnoreCase("wed"))
			indexDayOfWeek = 4;
		if (userDay.toLowerCase().equalsIgnoreCase("thu"))
			indexDayOfWeek = 5;
		if (userDay.toLowerCase().equalsIgnoreCase("fri"))
			indexDayOfWeek = 6;
		if (userDay.toLowerCase().equalsIgnoreCase("sat"))
			indexDayOfWeek = 7;
		if (userDay.toLowerCase().equalsIgnoreCase("sun"))
			indexDayOfWeek = Calendar.SUNDAY;
		System.out.println("Your stat date is:");
		System.out.println(usersCalendar.getTime());
		
		if (indexDayOfWeek>=usersCalendar.get(Calendar.DAY_OF_WEEK)){
			indexDayOfWeek = indexDayOfWeek - usersCalendar.get(Calendar.DAY_OF_WEEK);
		} else {
			indexDayOfWeek = 7 - usersCalendar.get(Calendar.DAY_OF_WEEK) + indexDayOfWeek;
		}

		usersCalendar.add(Calendar.HOUR, indexDayOfWeek*24);
	}

	private void printAllUserDays(Calendar usersCalendar) {
		System.out.println("All "+usersData.getDayOfWeek()+"s with "+usersData.getUserDay()+"."
					+usersData.getUserMonth()+"."+usersData.getUserYear()+" are next:");
		System.out.println(usersCalendar.getTime());
		while (usersCalendar.getTimeInMillis()+604800000 < System.currentTimeMillis()) {
			usersCalendar.add(Calendar.DAY_OF_WEEK, 7);
			System.out.println(usersCalendar.getTime());
		}

	}

	private void usersRepeat() {
		int repeatParameter = 1;
		setDataInCalendarAndPrintAll();

		while (repeatParameter != 0) {
			System.out.println("\nWould you like to repeat +"
					+ "\nor to change this information?");
			System.out
					.println("0 - no, i want to exit; +"
							+ "\n1 - yes, i want to reapet; \n2 - change entered information");
			repeatParameter = input.inputIntParameter();

			switch (repeatParameter) {
			case 1:
				this.usersData = new UserInput();
				setDataInCalendarAndPrintAll();
				break;
			case 2:
				changeInputInformations();
				setDataInCalendarAndPrintAll();
			case 0:
				break;
			default:
				System.out.println("Something went wrong!");
				break;
			}

		}
		if (repeatParameter == 0) {
			System.out.close();
		}

	}

	private void changeInputInformations() {
		int menuParameter = 1;
		while (menuParameter != 0) {
			menuParameter = changeMenu();
			switch (menuParameter) {
			case 1:
				System.out.println("Please enter new time zone you need");
				usersData.setUserTimeZone(input.inputStringParameter());
				break;
			case 2:
				System.out.println("Please enter the start year");
				usersData.setUserYear(input.inputIntParameter());
				break;
			case 3:
				System.out.println("Please enter the start month");
				usersData.setUserMonth(input.inputIntParameter());
				break;
			case 4:
				System.out.println("Please enter the start day");
				usersData.setUserDay(input.inputIntParameter());
				break;
			case 5:
				System.out.println("Please enter day of week");
				usersData.setDayOfWeek(input.inputStringParameter());
				break;
			case 0:
				break;
			default:
				System.out.println("Something went wrong!");
				break;
			}
			if (menuParameter != 0) {
				System.out.println("\nWould you like to continue?");
				System.out.println("0 - no, I did everything I could!"
						+ "\n1 - yes, I want to change something else");
				menuParameter = input.inputIntParameter();
			}
		}
	}

	private void setDataInCalendarAndPrintAll() {
		System.setProperty("user.timezone", usersData.getUserTimeZone());
		//usersCalendar.setTimeZone(value);
		usersCalendar.set(usersData.getUserYear(), usersData.getUserMonth()-1,
				usersData.getUserDay(), 12, 0, 0);
		findNextUsersDayOfWeek(usersData.getDayOfWeek().substring(0, 3),
				usersCalendar);
		printAllUserDays(usersCalendar);
	}

	private int changeMenu() {
		System.out.print("1 - to change timezone\t\t");
		System.out.println("2 - to change year");
		System.out.print("3 - to change month\t\t");
		System.out.println("4 - to change day");
		System.out.println("5 - to change day of week");
		System.out.println("0 - I changed my mind. I want to go");
		int n = input.inputIntParameter();
		return n;
	}

}
