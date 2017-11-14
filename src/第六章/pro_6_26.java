package 第六章;
//import java.util.Scanner;
public class pro_6_26 {
	public static void main(String[] args) {
		System.out.println("the first 100 huiwen and prime numbers are:");
		printPrimeIntNumbers(100);
	}
	public static void printPrimeIntNumbers(int num){
		final int NUMOFLINE=10;
		int count=0,number=2;
		while(count<num){
			if(isPrime(number)&&huiwen(number)){
				count++;
				if(count%NUMOFLINE==0){
					System.out.printf("%-4d\n",number);
				}
				else
					System.out.printf("%-4d ", number);
			}
			number++;
		}
	}
	public static boolean huiwen(int n){
		//String word=String.valueOf(n);
		String word=""+n;
		   int i = word.length();
		   int j = 0;
		   while (j <= (i / 2) -1 && word.charAt(j) == word.charAt(i - j - 1))
		     j++;
		   if (j == i / 2)
		    return true;
		   else
		    return false;
	}
	public static boolean isPrime(int n){
		for(int divisor=2;divisor<=n/2;divisor++){
			if(n%divisor==0){
				return false;
			}
		}
		return true;
	}
}
