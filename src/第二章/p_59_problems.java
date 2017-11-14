package 第二章;
import java.util.*;
public class p_59_problems {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		//1
		/*System.out.print("please ender a cesius: ");
		double ce;//�����¶�
		ce=input.nextDouble();
		System.out.println(ce+" celsius is "+(ce*(9.0/5)+32)+" fahrenheit");//�����¶�
		//2
		System.out.print("enter the radius and length of a cylinder:");
		double radius,length;//�뾶����
		radius=input.nextDouble();
		length=input.nextDouble();
		System.out.println("the area is "+Math.PI*Math.pow(radius, 2));//���
		System.out.println("the volume is "+Math.PI*Math.pow(radius, 2)*length);//���
		*///6
		System.out.println("enter a number between 0 and 1000: ");
		int x,x1,x2,x3;//x1��λ��x2ʮλ��x3��λ
		x=input.nextInt();
		x1=x%10;
		if(x/10>0){
			x/=10;
			x2=x%10;
			if(x/10>0){
				x/=10;
				x3=x%10;
				System.out.println("the sum of the digits is "+(x1+x2+x3));
			}
			else{
				System.out.println("the sum of the digits is "+(x1+x2));
			}
		}
		else{
			System.out.println("the sum of the digits is "+x1);
		}
		
		//
		
	}
}
