package 第四章;
import java.util.Scanner;;
public class pro_4_2 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double x1,x2,y1,y2,d;
		final double r=6371.01;
		System.out.print("Enter point 1 (latitude and longitude) in degrees :");
		x1=input.nextDouble();y1=input.nextDouble();
		System.out.print("Enter point 2 (latitude and longitude) in degrees :");
		x2=input.nextDouble();y2=input.nextDouble();
		d=r*Math.acos(Math.sin(Math.toRadians(x1))*Math.sin(Math.toRadians(x2))+Math.cos(Math.toRadians(x1))*
		Math.cos(Math.toRadians(x2))*Math.cos(Math.toRadians(y1)-Math.toRadians(y2)));
		System.out.println("The distance between the two points is "+d+" km");
	}
}
