package 测试;


public class maxValueOfSub {
	public static int MaxSubSum3(int []arr)  
	{  
	    int i;  
	    int MaxSum = 0;  
	    int CurSum = 0;  
	    for(i=0;i<arr.length;i++)  
	    {  
	        CurSum += arr[i];  
	        if(CurSum > MaxSum)  
	            MaxSum = CurSum;  
	        //����ۼӺͳ���С��0�������  
	        //������������п϶������ܰ���ǰ���Ԫ�أ�  
	        //��ʱ���ۼӺ���0�����¸�Ԫ�����¿�ʼ�ۼ�  
	        if(CurSum < 0)  
	            CurSum = 0;  
	    }  
	    return MaxSum;  
	}  
	public static void main(String[] args) {
		int[] a={2,4,-7,5,2,-1,2,-4,3};
		int x=MaxSubSum3(a);
		System.out.println(x);
	}

}
