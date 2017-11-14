package 第二章;

public class p_45_2_7 {
	public static void main(String[] args) {
		long totalMillisenconds=System.currentTimeMillis();
		long totalSeconds=totalMillisenconds/1000;
		long currentSecond=totalSeconds%60;
		long totalMinutes=totalSeconds/60;
		long currentMinute=totalMinutes%60;
		long totalHours=totalMinutes/60;
		long currentHour=totalHours%24+8;//����һ��ʱ��ת��Ϊ������������ʱ��
		long totalDays=totalHours/24;
		long totalYear=totalDays/365;
		System.out.println(totalYear+" years "+totalDays+" days "+currentHour
				+":"+currentMinute+":"+currentSecond);//�Ե���ϵͳʱ��׼
	}
}