package 第十三章;
import java.util.ArrayList;

import javax.imageio.event.IIOReadProgressListener;

import java.math.*;
public class LargestNumbers {
	public static void main(String[] args) {
		ArrayList<Number> list=new ArrayList<>();
		list.add(45);
		list.add(3445.53);
		list.add(new BigInteger("34343113112313"));
		list.add(new BigDecimal("32.1213142112313"));
		System.out.println("The largest number is "+getLargestNumber(list));
	}
	public static Number getLargestNumber(ArrayList<Number> list){
		if(list==null||list.size()==0)
			return null;
		Number number=list.get(0);
		for(int i=0;i<list.size();i++){
			if(number.doubleValue()<list.get(i).doubleValue())
				number=list.get(i);
		}
		return number;
	}
}
