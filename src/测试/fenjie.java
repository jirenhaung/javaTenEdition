package 测试;

import java.util.Scanner;

public class fenjie {
	public static void main(String []args){
        Scanner s=new Scanner(System.in);
        System.out.println("����һ����������");
        int n=s.nextInt();
        int  k=2;  //����һ����С�������� 
        System.out.print(n+"="); 
        while (k<=n){    //����ѭ���ж�   
            if(k==n){ 
                System.out.print(n);
                break;
            }else if (n%k==0){  
                System.out.print(k+"*");
                n=n/k;
            }else k++; 
        }
    }
}
