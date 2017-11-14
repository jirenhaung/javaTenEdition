package 第二十章;
import java.util.*;
public class test {
	public static void main(String[] args) {
		/*List<String> list=Arrays.asList("red","green","head","blue");
		Collections.sort(list);
		System.out.println(list);
		List<String> list2=Arrays.asList("red","green","head","blue");
		Collections.sort(list2, Collections.reverseOrder());
		System.out.println(list2);
		List<String> list3=Arrays.asList("red","green","head","blue");
		Collections.reverse(list3);
		System.out.println(list3);*/
		String string="a + b = c  d";
		String []tokens=string.split(" ");
		for (String string2 : tokens) {
			System.out.println(string2);
		}
	}
}
