package 第七章编程习题题;
import java.util.*;
public class num1 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the number of students:");
		int total=input.nextInt();
		int [] stu=new int [total];
		for(int i=0;i<total;i++)
		{
			stu[i]=input.nextInt();
		}
		int max=stu[0];
		for(int j=1;j<total;j++)
		{
			if(stu[j]>=max)
				max=stu[j];
		}
		for(int i=0;i<total;i++)
		{
			if(stu[i]>=(max-10))
				System.out.println("Student "+i+" score is "+stu[i]+" and grade"
						+ " is "+" A");
			else if(stu[i]>=(max-20))
				System.out.println("Student "+i+" score is "+stu[i]+" and grade"
						+ " is "+" B");
			else if(stu[i]>=(max-30))
				System.out.println("Student "+i+" score is "+stu[i]+" and grade"
						+ " is "+" C");
			else if(stu[i]>=(max-40))
				System.out.println("Student "+i+" score is "+stu[i]+" and grade"
						+ " is "+" D");
			else
				System.out.println("Student "+i+" score is "+stu[i]+" and grade"
						+ " is "+" F");
		}
			
	}
}
