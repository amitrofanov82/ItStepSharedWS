import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoField;
import java.util.Locale;

public class ExampleForTimes {
	public static void main(String[] args) {
		Instant inst = null;
		ZonedDateTime zdt = ZonedDateTime.parse("2018-11-13T16:35:30-03:00");
		LocalDateTime ldt = //LocalDateTime.now();
			//LocalDateTime.now(Clock.system(ZoneId.of("UTC")));
			//LocalDateTime.now(ZoneId.of("UTC"));
			LocalDateTime.from(zdt);
			//LocalDateTime.of / parse/ 
			//LocalDateTime.ofEpochSecond(epochSecond, nanoOfSecond, offset)


		
		LocalDate ld; //ZonedDate?
		LocalTime lt;
		OffsetTime zt;
		
		System.out.println(zdt);
		System.out.println(ldt);
		
		int dow = ldt.get(ChronoField.DAY_OF_WEEK);
		String resultDoW = ChronoField.DAY_OF_WEEK.getDisplayName(Locale.getDefault());
		System.out.println(resultDoW + " : " + dow);
		
		
		
	}
}

























