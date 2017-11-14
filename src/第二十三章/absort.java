package 第二十三章;

public abstract class absort {
	public static boolean isSort(Comparable[] a){
		for (int i = 0; i < a.length; i++) 
			if (less(a[i],a[i-1])) return false;
		return true;
	}
	public static boolean less(Comparable v,Comparable w){
		return v.compareTo(w)<0;
	}
	public static void exch(Comparable[]a,int i,int j){
		Comparable t=a[i];a[i]=a[j];a[j]=t;
	}
}
