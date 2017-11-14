package 第九章;

import java.util.Date;

public class pro3 {
	public static void main(String[] args) {
		Date date=new Date();
		int time=10000;
		//System.out.println(date.toString());
		date.setTime(time);
		System.out.println(date.toString());
		for(int i=1;i<8;i++){
			date.setTime(time*=10);
			System.out.println(date.toString());
		}
		
	}
}
