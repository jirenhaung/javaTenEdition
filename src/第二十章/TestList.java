package 第二十章;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;


public class TestList {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add(1, "c");
		System.out.println(list);
		
		ArrayList<String> list2=(ArrayList<String>)(list.clone());
		list2.addAll(list);
		System.out.println(list2);
		
		System.out.println(list2.get(2));
		
		System.out.println(list2.indexOf("b"));
		
		System.out.println(list2.lastIndexOf("b"));
		
		ListIterator<String> iterator=list2.listIterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next().toUpperCase()+" ");
		}
		System.out.println();
		
		ListIterator<String>iterator2=list2.listIterator(3);
		while (iterator2.hasNext()) {
			System.out.print(iterator2.next().toUpperCase()+" ");
		}
		System.out.println();
		
		list.remove(1);
		System.out.println(list);
		
		list.remove("b");
		System.out.println(list);
		
		list.set(0, "A");
		System.out.println(list);
		
		List<String>list3=list2.subList(0, 3);
		System.out.println(list3);
		
		ListIterator<String>iterator3=list2.listIterator();
		iterator3.add("d");
		System.out.println(list2);
		
		ListIterator<String>iterator4=list2.listIterator();
		while (iterator4.hasNext()) {
			System.out.print(iterator4.next()+" ");
		}
		System.out.println();
		
		ListIterator<String>iterator5=list2.listIterator();
		int i=0;
		while (iterator5.hasNext()) {
			if(i==3){
				iterator5.add("h");
			}
			System.out.print(iterator5.nextIndex()+" "+iterator5.next()+" ");
			
			iterator5.set(((Integer)i).toString());
			i++;
		}
		System.out.println();
		while (iterator5.hasPrevious()) {
			
			System.out.print(iterator5.previousIndex()+" "+iterator5.previous()+" ");
		}
		System.out.println();
		System.out.println(list2);
	}

}
