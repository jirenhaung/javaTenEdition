package 第十九章;

//import charpter19.Exercise19_02.GenericStack;

public class pro_1 {
public static void main(String[] args) {
	GenericStack1<String> stack = new GenericStack1<String>();
    stack.push("Tom");
    stack.push("George");
    stack.push("Peter");
    System.out.println(stack.getSize());
    System.out.println(stack.peek());
    System.out.println(stack.pop());
    System.out.println(stack.peek());
}
}
class GenericStack1<E>{
	private E[] elements;
	private int size;
	
	public GenericStack1(){
		this(16);
	}
	public GenericStack1(int capacity){
		elements=(E[])new Object[capacity];
	}
	public void push(E value) {
	    if (size >= elements.length) {
	      E[] temp = (E[])new Object[elements.length * 2];
	      System.arraycopy(elements, 0, temp, 0, elements.length);
	      elements = temp;
	    }

	     elements[size++] = value;
	  }
	 public E pop() {
		    return elements[--size];
		  }
	 public E peek() {
		    return elements[size - 1];
		  }
	 public boolean isEmpty() {
		    return size == 0;
		  }
	 public int getSize() {
		    return size;
		  }
}