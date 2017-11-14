package 第十一章;

public class CircleFromSimpleGeometricObject extends SimpleGeometricObject{
	private double radius;
	public CircleFromSimpleGeometricObject(){	
	}
	public CircleFromSimpleGeometricObject(double radius){
		this.radius=radius;
	}
	public CircleFromSimpleGeometricObject(double radius,String color,
			boolean filed){
		this.radius=radius;
		setColor(color);
		setFiled(filed);
	}
	public double getRadius(){
		return radius;
	}
	public void setRadius(double radius){
		this.radius=radius;
	}
	public double getArea(){
		return radius*radius*Math.PI;
	}
	public double getDiameter(){
		return 2*radius;
	}
	public double getPerimeter(){
		return 2*Math.PI*radius;
	}
	public void printCircle(){
		System.out.println("The circle is created "+getDate()+
				" and the radius is "+radius);
	}
}
