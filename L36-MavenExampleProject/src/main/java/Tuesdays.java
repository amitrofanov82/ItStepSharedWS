import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class Tuesdays {
	
	private static final long XXI_CENTURY_START_IN_MINSK = 978300000000L - 3600000;
	
	public static void main(String[] args){
		Date date = new Date(XXI_CENTURY_START_IN_MINSK);
		Calendar cal = Calendar.getInstance(new Locale("ja", "JP", "JP"));
		System.out.println(cal.getClass());
		SimpleDateFormat formter = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy");
		formter.setTimeZone(TimeZone.getTimeZone("UTC"));
		cal.setTime(date);
		//cal.add(Calendar.HOUR, 14);
		cal.add(Calendar.HOUR, 24);
		
		while (cal.getTimeInMillis() < System.currentTimeMillis()) {
			System.out.println(formter.format(cal.getTime()));
			cal.add(Calendar.HOUR, (24*7));
		}
		
	}
}