package 第九章;

public class pro_9 {
	public static void main(String[] args) {
		RegularPolygon regularPolygon1=new RegularPolygon();
		RegularPolygon regularPolygon2=new RegularPolygon(6,4);
		RegularPolygon regularPolygon3=new RegularPolygon(10, 4, 6,7.8);
		System.out.println("�ܳ�Ϊ�� "+regularPolygon1.getPerimeter()
		+" ���Ϊ�� "+regularPolygon1.getArea());
		System.out.println("�ܳ�Ϊ�� "+regularPolygon2.getPerimeter()
		+" ���Ϊ�� "+regularPolygon2.getArea());
		System.out.println("�ܳ�Ϊ�� "+regularPolygon3.getPerimeter()
		+" ���Ϊ�� "+regularPolygon3.getArea());
	}
}
class RegularPolygon{
	private int edges=3;
	private double side=1;
	private double x=0;
	private double y=0;
	public RegularPolygon() {
		// TODO Auto-generated constructor stub
	}
	public RegularPolygon(int num,double side){
		edges=num;
		this.side=side;
		x=0;
		y=0;
	}
	public RegularPolygon(int num,double side,double x,double y){
		edges=num;
		this.side=side;
		this.x=x;
		this.y=y;
	}
	public int getEdges() {
		    return edges;
		  }

	public void setN(int number) {
		    edges = number;
		  }

	public double getSide() {
		    return side;
		  }

	public void setSide(double newSide) {
		    side = newSide;
		  }

	public double getX() {
		    return x;
		  }

	public void setX(double newX) {
		    x = newX;
		  }
		  
	public double getY() {
		    return y;
		  }

	public void setY(double newY) {
		    y = newY;
		  }
	public double getPerimeter(){
			  return edges*side;
		  }
	public double getArea(){
		return edges* side * side / (Math.tan(Math.PI / edges) * 4);
	}
}