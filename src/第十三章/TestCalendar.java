package 第十三章;
import java.util.*;
public class TestCalendar {
	public static void main(String[] args) {
		Calendar calendar=new GregorianCalendar();
		System.out.println("Current time is "+new Date());
		System.out.println("Year: "+calendar.get(Calendar.YEAR));
		System.out.println("Month: "+calendar.get(Calendar.MONTH));
		System.out.println("Date: "+calendar.get(Calendar.DATE));
		System.out.println("Hour: "+calendar.get(Calendar.HOUR));
		System.out.println("Hour_of_day: "+calendar.get(Calendar.HOUR_OF_DAY));
		System.out.println("Minute: "+calendar.get(Calendar.MINUTE));
		System.out.println("Second: "+calendar.get(Calendar.SECOND));
		System.out.println("Week: "+calendar.get(Calendar.DAY_OF_WEEK));
		System.out.println("MONTHS: "+calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println("Day_of_year: "+calendar.get(Calendar.DAY_OF_YEAR));
		System.out.println("am_pm: "+calendar.get(Calendar.AM_PM));
		
		//Calendar calendar2=new GregorianCalendar(2001, 9, 11);
		Calendar calendar2=new GregorianCalendar(2001, 9, 11);
		String [] weekdays={"sunday","monday","tuesday","wednesday","thursday",
				"firday","saturday"};
		System.out.println("September 11,2001 is a "+
				weekdays[calendar2.get(Calendar.DAY_OF_WEEK)-1]);
	}
}
