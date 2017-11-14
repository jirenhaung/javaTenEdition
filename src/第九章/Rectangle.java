package 第九章;

public class Rectangle {
	private double width=1;
	private double high=1;
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}
	public Rectangle(double width,double high){
		this.width=width;
		this.high=high;
	}
	public double getArea(){
		return width*high;
	}
	public double getPerimeter(){
		return 2*(width+high);
	}
	public static void main(String[] args) {
		Rectangle rectangle1=new Rectangle(4, 40);
		Rectangle rectangle2=new Rectangle(3.5, 35.9);
		System.out.println("The Rectangle1's width and high is "+
		rectangle1.width+", "+rectangle1.high);
		System.out.println("The Rectangle2's width and high is "+
		rectangle2.width+", "+rectangle2.high);
		System.out.println("The area and perimeter of rectangle1 is "+
		rectangle1.getArea()+", "+rectangle1.getPerimeter());
		System.out.println("The area and perimeter of rectangle2 is "+
				rectangle2.getArea()+", "+rectangle2.getPerimeter());
		
	}
}
