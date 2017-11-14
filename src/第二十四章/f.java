package 第二十四章;
import java.util.Scanner;
public class f {
	public static void main(String[] args) {
		 Scanner input=new Scanner(System.in);
	      int n=input.nextInt();
	      int [] a=new int [n];
	      for(int i=0;i<n;i++){
	      	a[i]=input.nextInt();
	      }
	      int a1=a[0];
	      int a2=a[1];
	      int answer=a1*a2;
	      int p=a1+a2;
	      for(int i=2;i<n;i++){
	        answer=answer+p*a[i];
	        p=p+a[i];
	      }
	      System.out.println(answer);
	}
	
}