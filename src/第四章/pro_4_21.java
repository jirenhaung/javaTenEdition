package 第四章;
import java.util.Scanner;
public class pro_4_21 {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.print("Enter a SSN:");
		String s=input.nextLine();
		boolean b = true;//�ڶ����ж���������ʼ�����û��ϵ
		if(s.length()==11){
		for (int i =0;i<=2;i++){    
			   if (!Character.isDigit(s.charAt(i))){  
			    b=false;  //������в������ֵ��ַ�������Ϊ��
			   }
			   b=true;//ȫΪ���֣�����Ϊ��
			  }
		for (int i =4;i<=5;i++){    
			   if (!Character.isDigit(s.charAt(i))){  
			    b=false; //������в������ֵ��ַ�������Ϊ�� 
			   }
			   b=true;//ȫΪ���֣�����Ϊ��
			  }
		for (int i =7;i<=10;i++){    
			   if (!Character.isDigit(s.charAt(i))){  
			    b=false;  //������в������ֵ��ַ�������Ϊ��
			   }
			   b=true;//ȫΪ���֣�����Ϊ��
			  }
		if(s.indexOf('-')!=3||s.indexOf('-',4)!=6)
			System.out.println(s+" is an invalid social security number");
		else if(!b)
			System.out.println(s+" is an invalid social security number");
		else {
			System.out.println(s+" is a valid social security number");
		}
		}
		else//���Ȳ�Ϊ�涨���ȣ�Ϊ������
			System.out.println(s+" is an invalid social security number");
		
	}
}
