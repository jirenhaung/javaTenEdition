package 第二十章;
import java.util.*;
public class TestArrayAndLinledList {
	public static void main(String[] args) {
		List<Integer> arraylist=new ArrayList<>();
		arraylist.add(1);
		arraylist.add(2);
		arraylist.add(3);
		arraylist.add(1);
		arraylist.add(4);
		arraylist.add(0, 10);
		arraylist.add(3, 30);
		System.out.println(arraylist);
		LinkedList<Object> linkedList=new LinkedList<>(arraylist);
		linkedList.add(1, "red");
		linkedList.removeLast();
		linkedList.addFirst("green");
		ListIterator<Object> listIterator=linkedList.listIterator(0);
		while(listIterator.hasNext()){
			System.out.print(listIterator.next()+" ");
		}
		System.out.println();
		listIterator=linkedList.listIterator(linkedList.size());
		while(listIterator.hasPrevious()){
			System.out.print(listIterator.previous()+" ");
		}
		
	}
}
