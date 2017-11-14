package 第二十二章;
import java.util.*;
public class sieveOfEratosthenes {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Find all prime numbers <=n,enter n: ");
		int n=input.nextInt();
		boolean[] prime=new boolean[n+1];
		for(int i=0;i<prime.length;i++)
			prime[i]=true;
		for(int k=2;k<=n/k;k++)
			if(prime[k]){
				for(int i=k;i<=n/k;i++)
					prime[k*i]=false;
			}
		int count=0;
		for(int i=2;i<prime.length;i++){
			if(prime[i]){
				count++;
				if(count%10==0)
					System.out.printf("%7d\n",i);
				else
					System.out.printf("%7d",i);
			}
		}
		System.out.println("\n"+count+" prime(s) less than or equal to "+n);
	}
}
