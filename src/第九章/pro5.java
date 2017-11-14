package 第九章;
import java.util.GregorianCalendar;
public class pro5 {
	public static void main(String[] args) {
		GregorianCalendar gCalendar=new GregorianCalendar();
		System.out.println(gCalendar.get(gCalendar.YEAR)+" �� "+
		gCalendar.get(gCalendar.MONTH)+" �� "+
		gCalendar.get(gCalendar.DAY_OF_MONTH)+" ��");
		gCalendar.setTimeInMillis(1234567898765L);
		System.out.println(gCalendar.get(gCalendar.YEAR)+" �� "+
				gCalendar.get(gCalendar.MONTH)+" �� "+
				gCalendar.get(gCalendar.DAY_OF_MONTH)+" ��");
	}
}
