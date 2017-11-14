package 第八章编程习题;

import java.util.*;
public class alibaba_moniti {
/** ������������������ʵ����ĿҪ��Ĺ��� **/
/** ��Ȼ����Ҳ���Բ��������ģ����������ȫ�����Լ����뷨�� ^-^  **/
    static int pick(int[] peaches) {
/*������Ŀ��˼��ת��Ϊ��һ�������в������������������ĳ��ȡ�*/
    	int max=1;
    	for(int i=0;i<peaches.length-1;i++){
    		int temp=peaches[i];
    		int count=1;
    		for(int j=i+1;j<peaches.length;j++){
    			if(peaches[j]>=temp){
    				temp=peaches[j];
    				count++;
    			}
    		}
    		if(count>max)
    			max=count;
    	}
    	return max;

    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int trees = Integer.parseInt(in.nextLine().trim());
        int[] peaches = new int[trees];
        for (int i = 0; i < peaches.length; i++) {
            peaches[i] = Integer.parseInt(in.nextLine().trim());
        }
        System.out.println(pick(peaches));
    }
}