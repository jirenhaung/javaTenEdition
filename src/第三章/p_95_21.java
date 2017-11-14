package 第三章;
import java.util.Scanner;
public class p_95_21 {
	public static void main(String[] args) {
		int h,q,m,k,j,d;
		Scanner input=new Scanner(System.in);
		System.out.print("enter year:");
		q=input.nextInt();
		System.out.print("enter month:");
		m=input.nextInt();
		System.out.print("enter day:");
		d=input.nextInt();
		
		if(m==1){
			q=q-1;m=13;
		}
		else if(m==2){
			q=q-1;m=14;
		}
		j=q/100;
		k=q%100;
		h=(q+26*(m+1)/10+k+k/4+j/4+5*j)%7;
		System.out.println(h);
	}
}
