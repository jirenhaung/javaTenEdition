package 第七章;

import javax.swing.OverlayLayout;

public class list7_5_225 {
	public static void main(String[] args) {
		printMax(1,2,2,1,4);
		printMax(new double []{1,2,3});
		//printMax(new int []{1,2,3});
	}
	public static void printMax(double...numbers) {
		if(numbers.length==0){
			System.out.println("No argument passed");
			return;
		}
		
		double result=numbers[0];
		for(int i=1;i<numbers.length;i++)
		{
			if(numbers[i]>result)
				result=numbers[i];
		}
		System.out.println("The max value is "+result);
	}
}
