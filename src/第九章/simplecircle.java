package 第九章;

public class simplecircle {
	public static void main(String[] args) {
		simplecircle circle1=new simplecircle();
		System.out.println("The area of the circle1 of radius "+
		circle1.radius+" is "+circle1.getArea());
		
		simplecircle circle2=new simplecircle(5);
		System.out.println("The area of the circle2 of radius "+
		circle2.radius+" is "+circle2.getArea());
		
		circle2.radius=10;
		System.out.println("The area of the after setnewradius circle2 of radius "+
				circle2.radius+" is "+circle2.getArea());
		
		simplecircle circle3=new simplecircle(10);
		System.out.println("The perimeter of the circle of radius "+
		circle3.radius+" is "+circle3.getPerimeter());
	}
	double radius;
	simplecircle() {
		radius=1;// TODO Auto-generated constructor stub
	}
	simplecircle(double newradius)
	{
		radius=newradius;
	}
	double getArea()
	{
		return radius*radius*Math.PI;
	}
	double getPerimeter()
	{
		return 2*radius*Math.PI;
	}
	void setRadius(double newradius)
	{
		radius=newradius;
	}
	
}
