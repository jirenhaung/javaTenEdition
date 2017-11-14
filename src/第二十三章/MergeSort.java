package 第二十三章;

public class MergeSort {
	public static void mergeSort(int []list){
		if(list.length>1){
			int []firstHalf=new int[list.length/2];
			System.arraycopy(list, 0, firstHalf, 0, list.length/2);
			mergeSort(firstHalf);
			
			int secondHalfLength=list.length-list.length/2;
			int []secondHalf=new int[secondHalfLength];
			System.arraycopy(list, list.length/2, secondHalf, 0, secondHalfLength);
			mergeSort(secondHalf);
			
			merge(firstHalf,secondHalf,list);
		}
	}
	public static void merge(int []list1,int []list2,int []temp){
		int current1=0;
		int current2=0;
		int current3=0;
		while(current1<list1.length&&current2<list2.length){
			if(list1[current1]<list2[current2])
				temp[current3++]=list1[current1++];
			else
				temp[current3++]=list2[current2++];
		}
		
		while(current1<list1.length)
			temp[current3++]=list1[current1++];
		
		while(current2<list2.length)
			temp[current3++]=list2[current2++];
	}
	public static void mergeSort(int[] list,int left,int right){
		int mid=(left+right)/2;
		if(left<right){
			mergeSort(list, left, mid);
			mergeSort(list, mid+1, right);
			merge(list,left,right);
		}
	}
	public static void merge(int[] a,int l,int h){
		int mid=(l+h)/2;
        int i=l;
        int j=mid+1;
        int count=0;
        int temp[]=new int[h-l+1];
        while(i<=mid&&j<=h){
            if(a[i]<a[j]){
                temp[count++]=a[i++];
            }else{
                temp[count++]=a[j++];
            }        
        }
        while(i<=mid){
            temp[count++]=a[i++];
        }
        while(j<=h){
            temp[count++]=a[j++];
        }
        count=0;
        while(l<=h){
            a[l++]=temp[count++];
        }
    }

	
	public static void main(String[] args) {
		int[]list={-8,3,2,5,6,1,-2,3,14,12};
		//mergeSort(list,0,list.length-1);
		mergeSort(list);
		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i]+" ");
		}
	}
}
