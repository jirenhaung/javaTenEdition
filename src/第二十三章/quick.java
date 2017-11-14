package 第二十三章;

public class quick extends absort {
	private static void sort(Comparable[]a){
		sort(a, 0, a.length-1);
	}
	public static void sort(Comparable[]a,int lo,int hi){
		if(hi<=lo) return;
		int j=paratition(a, lo, hi);
		sort(a, lo, j-1);
		sort(a, j+1, hi);
	}
	private static int paratition(Comparable[]a,int lo,int hi){
		int i=lo;int j=hi+1;
		Comparable v=a[lo];
		while (true) {
			while (less(a[++i], v)) if(i==hi)break;
			while(less(v, a[--j])) if(j==lo) break;
			if(i>=j) break;
			exch(a, i, j);
		}
		exch(a, lo, j);
		return j;
	}
	
	public static void main(String[] args) {
		Integer[] demo={8,20,5,9,11,1,6,7,10,25,1,3,54,4,6,15,11,13,14};
		//insertionSort(demo);
		sort(demo);
		//Arrays.sort(demo);
		for (int i = 0; i < demo.length; i++) {
			System.out.print(demo[i]+" ");
			
		}
	}

}
