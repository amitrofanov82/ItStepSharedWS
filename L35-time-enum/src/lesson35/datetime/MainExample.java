package lesson35.datetime;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

import javax.swing.text.DateFormatter;

public class MainExample {

	public static void main(String[] args) {
		//System.out.println(System.currentTimeMillis());
		//System.out.println(System.nanoTime());
		
		//Old java:
		Date d1 = new Date();
		Date d2 = new Date(0L);
		Date d3 = new Date(System.currentTimeMillis());
		
		//Calendar cal = new GregorianCalendar();
		Calendar cal = Calendar.getInstance();
		cal.setTime(d2);
		TimeZone tz;
		
		//System.out.println(d1);
		//System.out.println(d2);
		//System.out.println(d3);
		
		System.out.println(cal.getTime());
		cal.add(Calendar.HOUR, 10);
		cal.add(Calendar.SECOND, 10);
		cal.setTimeZone(TimeZone.getTimeZone("UTC"));
		System.out.println(cal.toString());
		
		
		String[] availableZone = TimeZone.getAvailableIDs();
		TimeZone z = null;
		for (String s: availableZone) {
			System.out.println(s);
			if (s.contains("Michigan")) {
				z = TimeZone.getTimeZone(s);
			}
		}
		System.out.println(z.getRawOffset());
		
		SimpleDateFormat df = new SimpleDateFormat("hh 'o''clock' a, zzzz");
		
		df.setTimeZone(TimeZone.getTimeZone("Michigan"));
		System.out.println(df.format(cal.getTime()));
		
	}
	
}
