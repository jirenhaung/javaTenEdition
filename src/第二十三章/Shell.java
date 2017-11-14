package 第二十三章;

public class Shell extends absort {

	public static void sort(Comparable[] a) {
		int N=a.length;
		int h=1;
		while (h<N/3) h=3*h+1;
		while (h>=1) {
			for (int i = h; i < N; i++) {
				for(int j=i;j>=h&&less(a[j], a[j-h]);j-=h)
					exch(a, j, j-h);
			}
			h=h/3;
		}
	}
	public static void main(String[] args) {
		Character[] ch={'s','h','e','l','l','s','o','r','t','e','x','a','m','p'};
		sort(ch);
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]+" ");
		}
	}

}
