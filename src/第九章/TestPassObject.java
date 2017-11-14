package 第九章;

public class TestPassObject {
	public static void main(String[] args) {
		CircleWithPrivateDataFields myCircle=new CircleWithPrivateDataFields(5.0);
		printCircle(myCircle);
	}
	public static void printCircle(CircleWithPrivateDataFields c){
		System.out.println("the area of the circle radius "+c.getRadius()+" is "
				+c.getArea());
	}
}
class CircleWithPrivateDataFields{
	private double radius=1;
	private static int numberOfObjects=0;
	public CircleWithPrivateDataFields(){
		numberOfObjects++;
	}
	public CircleWithPrivateDataFields(double radius){
		this.radius=radius;
		numberOfObjects++;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius=(radius>=0)?radius:0;
	}
	public static int getNumberOfObjects(){
		return numberOfObjects;
	}
	public double getArea() {
		return radius*radius*Math.PI;
	}
}
