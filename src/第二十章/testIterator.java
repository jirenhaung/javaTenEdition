package 第二十章;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class testIterator {

	public static void main(String[] args) {
		Collection<String> collection=new ArrayList<>();
		collection.add("new york");
		collection.add("atlanta");
		collection.add("dallas");
		collection.add("madison");
		Iterator<String> iterator=collection.iterator();
		iterator.next();
		iterator.next();
		iterator.remove();
		for (String string : collection) {
			System.out.println(string);
		}
	}

}
