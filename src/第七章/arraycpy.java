package 第七章;

import java.util.Arrays;
import java.util.ListIterator;

public class arraycpy {
	public static void main(String[] args) {
		int []source={3,4,5};
		System.out.println(Arrays.toString(source));
		int [] t=new int [source.length];
		System.arraycopy(source, 0, t, 0, source.length);//�������鷽��
		for(int i=0;i<source.length;i++)
			System.out.print(t[i]+" ");
		System.out.println();
		int [][] n=new int [3][4];
		System.out.println(n.length);
		/*int [] c;
		c=new int [20];
		System.out.println(c.length);
		c=new int [30];//������ǰ���20���ռ�ͳ���������
		System.out.println(c.length);
		*/
		int [] list={1,2,3,4,5,6};
		for(int i=0,j=list.length-1;i<list.length/2;i++,j--)
		{
			int temp=list[i];
			list[i]=list[j];
			list[j]=temp;
		}
		for(int i=0;i<list.length;i++)
			System.out.print(list[i]+" ");
	}
}
