package 第四章;

public class pro_4_6 {
	public static void main(String[] args) {
	double  angle,x1,x2,x3,y1,y2,y3;
	final int R=40;
	angle=Math.random()*2*Math.PI;
	x1=R*Math.cos(angle);y1=R*Math.sin(angle);
	angle=Math.random()*2*Math.PI;
	x2=R*Math.cos(angle);y2=R*Math.sin(angle);
	angle=Math.random()*2*Math.PI;
	x3=R*Math.cos(angle);y3=R*Math.sin(angle);
	//�������߳���
	double c=2*Math.sqrt((40*40-(x1+x2)/2*(x1+x2)/2-(y1+y2)/2*(y1+y2)/2));
	double b=2*Math.sqrt((40*40-(x1+x3)/2*(x1+x3)/2-(y1+y3)/2*(y1+y3)/2));
	double a=2*Math.sqrt((40*40-(x3+x2)/2*(x3+x2)/2-(y3+y2)/2*(y3+y2)/2));
	//����Ƕ�
	double A=Math.toDegrees(Math.acos((a*a-b*b-c*c)/(-2*b*c)));
	double B=Math.toDegrees(Math.acos((b*b-a*a-c*c)/(-2*a*c)));
	double C=Math.toDegrees(Math.acos((c*c-b*b-a*a)/(-2*b*a)));
	double x=A+B+C;
	//���
	System.out.println(A+" "+B+" "+C);
	System.out.println(x);
	}
}
