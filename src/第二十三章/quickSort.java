package 第二十三章;

public class quickSort {
	public static void quickSort(int []list){
		quickSort(list,0,list.length-1);
	}
	public static void quickSort(int []list,int first,int last){
		if(last>first){
			int pivotIndex=partition(list,first,last);
			quickSort(list, first, pivotIndex-1);
			quickSort(list, pivotIndex+1, last);
		}
	}
	/*public static int partition(int []list,int first,int last){
		int pivot=list[first];
		int low=first+1;
		int high=last;
		while(high>low){
			while(low<=high&&list[low]<=pivot)
				low++;
			while(low<=high&&list[high]>pivot)
				high--;
			if(high>low){
				int temp=list[high];
				list[high]=list[low];
				list[low]=temp;
			}
		}
		while(high>first&&list[high]>=pivot) 
			high--;
		if(pivot>=list[high]){
			list[first]=list[high];
			list[high]=pivot;
			return high;
		}
		else {
			return first;
		}
	}*/
	public static int partition(int []list,int first,int last){
		int key=list[first];
		int l=first;
		int h=last;
		while(l<h){
			while(h>l&&list[h]>=key)
				h--;
			list[l]=list[h];
			while(h>l&&list[l]<=key)
				l++;
			list[h]=list[l];
		}
		list[l]=key;
		return l;
	}
	public static void selectSort(int []list){
		for(int i=0;i<list.length;i++){
			//int min=list[i];
			for(int j=i+1;j<list.length;j++){
				if(list[i]>list[j]){
					int temp=list[j];
					list[j]=list[i];
					list[i]=temp;
				}
			}
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
	public static void bubbleSort(int []list){
		boolean isChange=true;
		for(int i=0;i<list.length&&isChange;i++){
			isChange=false;
			for(int j=1;j<list.length-i;j++){
				if(list[j-1]>list[j]){
					int temp=list[j-1];
					list[j-1]=list[j];
					list[j]=temp;
					isChange=true;
				}
			}
		}
	}
	public static void main(String[] args) {
		//int list[]={2,3,2,5,6,1,-2,3,14,12};
		int list[]={4,5,3,4,1,2,5,6,4};
		quickSort(list);
		//selectSort(list);
		//bubbleSort(list);
		//insertionSort(list);
		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i]+" ");
		}
	}
}
