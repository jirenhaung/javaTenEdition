package 第一章习题;

public class p_27_1_11 {
	public static void main(String[] args) {
		double a=24*60*60*365;
		int p=312032486;
		double x=a/7;
		double y=a/13;
		double z=a/45;
		double q=x-y+z;
		System.out.println(p+q);
		System.out.println(p+q*2);
		System.out.println(p+q*3);
		System.out.println(p+q*4);
		System.out.println(p+q*5);
	}
}
