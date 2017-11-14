package 第十三章;

import java.util.ArrayList;

public class test {
	public static void main(String[] args) {
		//Number x=new Integer(3);
		//System.out.println(x.intValue());
		//System.out.println(((Integer)x).compareTo(new Integer(4)));
		//System.out.println(new Integer(3).compareTo(new Integer(-2)));
		Integer n1=new Integer(3);
		Object n2=new Integer(4);
		System.out.println(n1.compareTo((Integer)n2));
		/*ArrayList<String> list=new ArrayList<>();
		list.add("new york");
		ArrayList<String> list1=list;
		ArrayList<String> list2=(ArrayList<String>)(list.clone());
		list.add("atlanta");
		System.out.println(list==list1);
		System.out.println(list==list2);
		System.out.println("list is"+list);
		System.out.println("list1 is"+list1);
		System.out.println("list2.get(0) is "+list2.get(0));
		System.out.println("list2.size() is "+list2.size());*/
	}
}
/*interface A{
	void m1();
}
class B implements A{
	void m1(){
		System.out.println("m1");
	}
}*/