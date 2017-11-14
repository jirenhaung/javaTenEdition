package 第九章;
//import java.awt.geom.Point2D;
import javafx.geometry.Point2D;
public class testpoint2d {
	public static void main(String[] args) {
		Point2D p1=new Point2D(1.5,5.5);
		Point2D p2=new Point2D(-5.3,-4.4);
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p1.distance(p2));
	}
}
