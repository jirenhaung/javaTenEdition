package 第七章编程习题题;

import java.util.Scanner;//7_5
public class num7_3_P_236 {
	public static void main(String [] args){
		Scanner input=new Scanner(System.in);
		int []a=new int [10];
		a[0]=input.nextInt();
		int n=1;
		int b=1;
		for(int i=1;i<10;i++)
		{
			int c=input.nextInt();
			for(int j=0;j<n;j++)
			{
				if(a[j]!=c){
					b=1;
				}	
				else{
	     			b=0;
	     			break;
				}
			}
			if(b==1){
				a[n]=c;n++;
			}
		}
		System.out.println("The number of distinct number is "+n);
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
	}
}
