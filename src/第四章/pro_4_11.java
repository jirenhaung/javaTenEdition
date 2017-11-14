package 第四章;
import java.util.Scanner;
public class pro_4_11 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a decimal value ( 0 to 15):");
		int t=input.nextInt();
		if(t>=0&&t<=15){
			if(t<10)
				System.out.println("The hex value is "+t);
			else
				System.out.println("THe hex value is "+(char)(t+55));
		}
		else{
			System.out.println(t+" is an invalid input");
		}
		//4_12
		System.out.print("Enter a hex digit:");
		String s=input.next();
		char ch=s.charAt(0);
		if(ch>='0'&&ch<='9'){
			int i=(int)(ch)-48;//0~9��ASCII���48-57��
			int x1,x2,x3,x4;
			x1=i%2;i=i/2;
			x2=i%2;i=i/2;
			x3=i%2;i=i/2;
			x4=i%2;i=i/2;
			System.out.println(""+x4+x3+x2+x1);
		}
		else if(ch>='A'&&ch<='F'){
			int i=(int)(ch)-(65-10);//A~Z��ASCII���65-90,A��ʾ10��
			int x1,x2,x3,x4;
			x1=i%2;i=i/2;
			x2=i%2;i=i/2;
			x3=i%2;i=i/2;
			x4=i%2;i=i/2;
			System.out.println(""+x4+x3+x2+x1);
		}
		else
			System.out.println(ch+" is aninvlid input");
	}
}
