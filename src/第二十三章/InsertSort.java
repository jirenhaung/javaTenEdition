package 第二十三章;

public class InsertSort {
	public static void insertionSort(int[] list) {
		for(int i=1;i<list.length;i++){
			int currentElemet=list[i];
			int k;
			for(k=i-1;k>=0&&list[k]>currentElemet;k--)
				list[k+1]=list[k];
			list[k+1]=currentElemet;
		}
	}
}
