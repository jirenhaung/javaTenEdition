package 第八章编程习题;
import java.util.Scanner;
public class num8_8_P260 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the number of points: ");
		int numberOfPoints=input.nextInt();
		
		//create an array to store points
		double[][] points=new double[numberOfPoints][2];
		System.out.print("Enter "+numberOfPoints+" points:��");
		for(int i=0;i<points.length;i++)
		{
			points[i][0]=input.nextDouble();
			points[i][1]=input.nextDouble();
		}
		int []p1=new int [8];
		int []p2=new int [8];
		p1[0]=0;p2[0]=1;
		int n=0;
		double shortestDistance=distance(points[p1[0]][0],points[p1[0]][1],
				points[p2[0]][0], points[p2[0]][1]);//Initialize shortestDistance
		for(int i=0;i<points.length;i++){
			for(int j=i+1;j<points.length;j++){
				double distance=distance(points[i][0], points[i][1], 
						points[j][0], points[j][1]);
				if(shortestDistance>distance){
					p1[0]=i;
					p2[0]=j;
					shortestDistance=distance;
					n=1;
				}
				else if(shortestDistance==distance){
					p1[n]=i;
					p2[n]=j;
					n++;
				}
			}
		}
		for(int x=0;x<n;x++)
		{
			System.out.println("The cloest two points are "+
		       "("+points[p1[x]][0]+","+points[p1[x]][1]+")"+
					") and ("+points[p2[x]][0]+","+points[p2[x]][1]+")");
		}
		System.out.println("Their distance is"+shortestDistance);
	}
	
	public static double distance(double x1,double y1,double x2,double y2){
		return Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
	}
}
