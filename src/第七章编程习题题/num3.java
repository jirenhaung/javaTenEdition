package 第七章编程习题题;
import java.util.Scanner;
public class num3 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int [] a=new int [100];//�������顣
		int [] b=new int [1000];//�����������顣
		int i=0;
		System.out.print("Enter the integers between 1 and 100:");
		while((b[i]=input.nextInt())!=0)//�������ֲ�Ϊ��ͼ�������
		{
			a[b[i]-1]++;//����
			i++;
		}
		for(int j=0;j<100;j++)
		{
			if(a[j]==1)
				System.out.println((j+1)+" occurs "+a[j]+" time");
			else if(a[j]>1)
				System.out.println((j+1)+" occurs "+a[j]+" times");
			
		}
	}
}
