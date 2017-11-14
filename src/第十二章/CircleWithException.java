package 第十二章;

public class CircleWithException {
	private double radius;
	private static int numberOfObjects=0;
	public CircleWithException(){
		this(1.0);
	}
	public CircleWithException(double newRadius){
		setRadius(newRadius);
		numberOfObjects++;
	}
	public double getRadius(){
		return radius;
	}
	public void setRadius(double newRadius)
		/*throws IllegalArgumentException*//*ǰ���Ǿ仰����ʡ��
		 * ��Ϊ��������쳣��һ������*/{
			if(newRadius>=0)
				radius=newRadius;
			else
				throw new IllegalArgumentException("Radius cannot be negative");
		}
	public static int getNumberIfObjects(){
		return numberOfObjects;
	}
	public double findArea(){
		return radius*radius*Math.PI;
	}
}
