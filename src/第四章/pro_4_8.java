package 第四章;
import java.util.Scanner;
public class pro_4_8 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter an ASCII code : ");
		int t=input.nextInt();
		System.out.println("the character for ASCII code "+t+" is "+(char)t);
		System.out.println("Enter a character:");
		String s=input.next();
		char ch=s.charAt(0);
		System.out.println("The Unicode for character "+ch+" is "+(int)ch);
	}
}
