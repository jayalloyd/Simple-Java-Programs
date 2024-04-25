package simple_progams;
import java.time.*;
public class DateAndTimeDemo {
	public static void main(String a[]) {
		//using new date and time API of java
		LocalDate date=LocalDate.now();
		System.out.println(date);
		int day=date.getDayOfYear();
		System.out.println(day);
		LocalTime time=LocalTime.now();
		System.out.println(time);
		int hour=time.getHour();
		System.out.println(hour);
	}

}
