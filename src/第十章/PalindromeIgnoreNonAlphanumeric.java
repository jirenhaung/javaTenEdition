package 第十章;
import java.util.Scanner;
public class PalindromeIgnoreNonAlphanumeric {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a String: ");
		String s=input.nextLine();
		System.out.println("Ignoring nonalphanumeric characters, \nis"
		+s+" a palindrome?"+isPalinderome(s));
		input.close();
	}
	public static boolean isPalinderome(String s){
		String s1=filter(s);
		String s2=reverse(s1);
		return s1.equals(s2);
	}
	public static String filter(String s){
		StringBuilder stringBuilder=new StringBuilder();
		for(int i=0;i<s.length();i++){
			if(Character.isLetterOrDigit(s.charAt(i))){
				stringBuilder.append(s.charAt(i));
			}
		}
		return stringBuilder.toString();
	}
	public static String reverse(String s){
		StringBuilder stringBuilder=new StringBuilder(s);
		stringBuilder.reverse();
		return stringBuilder.toString();
	}
}
