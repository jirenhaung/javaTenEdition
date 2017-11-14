package 第二十三章;

public class mergetion extends absort {
	private static Comparable[] aux;
	
	private static void sort(Comparable[] a){
		aux=new Comparable[a.length];
		sort(a, 0, a.length-1);
	}
	
	public static void sort(Comparable[] a,int lo,int hi){
		if (hi<=lo) return;
		int mid=lo+(hi-lo)/2;
		sort(a,lo,mid);
		sort(a, mid+1, hi);
		merge(a, lo,mid, hi);
	}
	
	private static void merge(Comparable[]a,int lo,int mid,int hi){
		int i=lo;int j=mid+1;
		for (int k = lo; k <=hi; k++) {
			aux[k]=a[k];
		}
		for (int k = lo; k <=hi ; k++) {
			if (i>mid) a[k]=aux[j++];
			else if(j>hi) a[k]=aux[i++];
			else if(less(aux[j], aux[i])) a[k]=aux[j++];
			else a[k]=aux[i++];
		}
	}
	public static void main(String[] args) {
		Integer[] demo={88,20,5,9,11,1,6,7,10,25,1,3,54,4,6,15,11,13,14};
		//insertionSort(demo);
		sort(demo);
		//Arrays.sort(demo);
		for (int i = 0; i < demo.length; i++) {
			System.out.print(demo[i]+" ");
			
		}
	}

}
