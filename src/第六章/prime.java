package 第六章;

public class prime {
	public static void main(String[] args) {
		int count=0;
		for(int i=1000;i<10000;i++){
			if(isPrime(i)){
			count++;
			System.out.println(i);
			}
		}
		System.out.println(count);
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
