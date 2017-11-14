package 第二十一章;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {
	public static void main(String[] args) {
		Set<String> set=new HashSet<>();
		
		set.add("London");
		set.add("Paris");
		set.add("New York");
		set.add("San Francisco");
		set.add("Beijing");
		set.add("New York");
		
		TreeSet<String>treeSet=new TreeSet<>(set);
		System.out.println("Sorted tree set:"+treeSet);
		
		System.out.println("first():"+treeSet.first());//���ؼ����е�һ��Ԫ��
		System.out.println("last():"+treeSet.last());
		System.out.println("headSet(x):"+treeSet.headSet("New York"));//���ؼ�����С�ڵĲ���
		System.out.println("tailSet(x):"+treeSet.tailSet("New York"));//���ش��ڻ����x�ĵ���һ����
		
		System.out.println("lower(x):"+treeSet.lower("P"));//����С��x�����Ԫ��,û�оͷ���null
		System.out.println("higher(x):"+treeSet.higher("P"));//����x����С
		System.out.println("floor(x):"+treeSet.floor("P"));//С�ڻ����x�����Ԫ��
		System.out.println("ceiling(x):"+treeSet.ceiling("P"));//���ڻ����x����С
		System.out.println("pollFirst():"+treeSet.pollFirst());//ɾ���ͷ��ص�һ��Ԫ��
		System.out.println("pollLast():"+treeSet.pollLast());//���һ��Ԫ��
		
		System.out.println("New tree set :"+treeSet);
	}

}
