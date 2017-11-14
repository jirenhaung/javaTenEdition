package 第三章;
import java.util.Scanner;
public class p_93_5 {
	public static void main(String[] args) {
		int weekday,days;
		Scanner input=new Scanner(System.in);
		while(true){
		System.out.println("Enter today's day:");
		weekday=input.nextInt();//��ʼ�����ڼ�
		System.out.println("Enter the number of days elapsed since today:");
		days=input.nextInt();//��������
		int day=(weekday+days)%7;//֮�������ڼ�
		switch (weekday) {
		case 0:
			switch (day) {
			case 0:
				System.out.println("Today is Sunday and the future day is Sunday");
				break;
			case 1:
				System.out.println("Today is Sunday and the future day is Monday");
				break;
			case 2:
				System.out.println("Today is Sunday and the future day is Tuesday");
				break;
			case 3:
				System.out.println("Today is Sunday and the future day is Wednesday");
				break;
			case 4:
				System.out.println("Today is Sunday and the future day is Thursday");
				break;
			case 5:
				System.out.println("Today is Sunday and the future day is Friday");
				break;
			case 6:
				System.out.println("Today is Sunday and the future day is Staturday");
				break;
			default:
				System.out.println("����");
				break;
			}
			break;
		case 1:
			switch (day) {
			case 0:
				System.out.println("Today is Monday and the future day is Sunday");
				break;
			case 1:
				System.out.println("Today is Monday and the future day is Monday");
				break;
			case 2:
				System.out.println("Today is Monday and the future day is Tuesday");
				break;
			case 3:
				System.out.println("Today is Monday and the future day is Wednesday");
				break;
			case 4:
				System.out.println("Today is Monday and the future day is Thursday");
				break;
			case 5:
				System.out.println("Today is Monday and the future day is Friday");
				break;
			case 6:
				System.out.println("Today is Monday and the future day is Staturday");
				break;
			default:
				System.out.println("����");
				break;
			}
			break;
		case 2:
			switch (day) {
			case 0:
				System.out.println("Today is Tuesday and the future day is Sunday");
				break;
			case 1:
				System.out.println("Today is Tuesday and the future day is Monday");
				break;
			case 2:
				System.out.println("Today is Tuesday and the future day is Tuesday");
				break;
			case 3:
				System.out.println("Today is Tuesday and the future day is Wednesday");
				break;
			case 4:
				System.out.println("Today is Tuesday and the future day is Thursday");
				break;
			case 5:
				System.out.println("Today is Tuesday and the future day is Friday");
				break;
			case 6:
				System.out.println("Today is Tuesday and the future day is Staturday");
				break;
			default:
				System.out.println("����");
				break;
			}
			break;
		case 3:
			switch (day) {
			case 0:
				System.out.println("Today is Wednesday and the future day is Sunday");
				break;
			case 1:
				System.out.println("Today is Wednesday and the future day is Monday");
				break;
			case 2:
				System.out.println("Today is Wednesday and the future day is Tuesday");
				break;
			case 3:
				System.out.println("Today is Wednesday and the future day is Wednesday");
				break;
			case 4:
				System.out.println("Today is Wednesday and the future day is Thursday");
				break;
			case 5:
				System.out.println("Today is Wednesday and the future day is Friday");
				break;
			case 6:
				System.out.println("Today is Wednesday and the future day is Staturday");
				break;
			default:
				System.out.println("����");
				break;
			}
			break;
		case 4:
			switch (day) {
			case 0:
				System.out.println("Today is Thursday and the future day is Sunday");
				break;
			case 1:
				System.out.println("Today is Thursday and the future day is Monday");
				break;
			case 2:
				System.out.println("Today is Thursday and the future day is Tuesday");
				break;
			case 3:
				System.out.println("Today is Thursday and the future day is Wednesday");
				break;
			case 4:
				System.out.println("Today is Thursday and the future day is Thursday");
				break;
			case 5:
				System.out.println("Today is Thursday and the future day is Friday");
				break;
			case 6:
				System.out.println("Today is Thursday and the future day is Staturday");
				break;
			default:
				System.out.println("����");
				break;
			}
			break;
		case 5:
			switch (day) {
			case 0:
				System.out.println("Today is Friday and the future day is Sunday");
				break;
			case 1:
				System.out.println("Today is Friday and the future day is Monday");
				break;
			case 2:
				System.out.println("Today is Friday and the future day is Tuesday");
				break;
			case 3:
				System.out.println("Today is Friday and the future day is Wednesday");
				break;
			case 4:
				System.out.println("Today is Friday and the future day is Thursday");
				break;
			case 5:
				System.out.println("Today is Friday and the future day is Friday");
				break;
			case 6:
				System.out.println("Today is Friday and the future day is Staturday");
				break;
			default:
				System.out.println("����");
				break;
			}
			break;
		case 6:
			switch (day) {
			case 0:
				System.out.println("Today is Staturday and the future day is Sunday");
				break;
			case 1:
				System.out.println("Today is Staturday and the future day is Monday");
				break;
			case 2:
				System.out.println("Today is Staturday and the future day is Tuesday");
				break;
			case 3:
				System.out.println("Today is Staturday and the future day is Wednesday");
				break;
			case 4:
				System.out.println("Today is Staturday and the future day is Thursday");
				break;
			case 5:
				System.out.println("Today is Staturday and the future day is Friday");
				break;
			case 6:
				System.out.println("Today is Staturday and the future day is Staturday");
				break;
			default:
				System.out.println("����");
				break;
			}
			break;

		default:
			System.out.println("�����");
			break;
		}
		}
	}
}
