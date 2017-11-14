package 第十八章;

public class RecursivePalindrome {
	public static boolean isPalindrome(String s){
		return isPalindrome(s,0,s.length()-1);
	}
	private static boolean isPalindrome(String s,int low,int high){
		if(high<=low)
			return true;
		else if(s.charAt(low)!=s.charAt(high))
			return false;
		else 
			return isPalindrome(s, low+1, high-1);
	}
	public static void main(String[] args) {
		System.out.println("Is moom a palindrome? "+isPalindrome("moom"));
		System.out.println("Is noon a palindrome? "+isPalindrome("noon"));
		System.out.println("Is ab a palindrome? "+isPalindrome("ab"));
		System.out.println("Is a a palindrome? "+isPalindrome("a"));
		System.out.println("Is aba a palindrome? "+isPalindrome("aba"));
	}
}
