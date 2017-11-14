package 第十一章;

public class RectangleFromSimpleGeometriObject extends SimpleGeometricObject{
	private double width;
	private double height;
	public RectangleFromSimpleGeometriObject(){
	}
	public RectangleFromSimpleGeometriObject(double width,double height){
		this.height=height;
		this.width=width;
	}
	public RectangleFromSimpleGeometriObject(double width,double height,
			String color,boolean filed){
		this.height=height;
		this.width=width;
		setColor(color);
		setFiled(filed);
	}
	public double getWidth(){
		return width;
	}
	public void setWidth(double width){
		this.width=width;
	}
	public double getHeight(){
		return height;
	}
	public void setHeight(double height){
		this.height=height;
	}
	public double getArea(){
		return width*height;
	}
	public double getPerimeter(){
		return 2*(width+height);
	}
}
