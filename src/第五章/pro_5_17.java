package 第五章;
import java.util.Scanner;
public class pro_5_17 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int num;
		System.out.print("Enter the number of lines:");
		num=input.nextInt();
		for(int i=1;i<=num;i++)
		{
			for(int j=0;j<2*(num-i);j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<i;j++)
			{
				System.out.print(i-j+" ");
			}
			for(int j=1;j<i;j++)
			{
				System.out.print(j+1+" ");
			}
			System.out.println();
		}
	}
}
