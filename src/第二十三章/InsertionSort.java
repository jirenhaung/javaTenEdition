package 第二十三章;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] demo={88,20,5,9,11,1,6,7,10,25,1,3,54,4,6,15,11,13,14};
		//insertionSort(demo);
		InsertSort(demo);
		//Arrays.sort(demo);
		for (int i = 0; i < demo.length; i++) {
			System.out.print(demo[i]+" ");
			
		}
		
	}
	public static void InsertSort(int [] a ){
		for (int i = 1; i < a.length; i++) {
			int current=a[i];
			int j;
			for (j = i-1; j >=0; j--) {
				if(a[j]>current){
					a[j+1]=a[j];
				}else{
					break;
				}
			}
			a[j+1]=current;
		}
	}
	public static void insertionSort(int[] list) {
		for(int i=1;i<list.length;i++){
			int currentElemet=list[i];
			int k;
			for(k=i-1;k>=0&&list[k]>=currentElemet;k--)
				list[k+1]=list[k];
			list[k+1]=currentElemet;
		}
	}

}
