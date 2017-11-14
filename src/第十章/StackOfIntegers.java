package 第十章;

public class StackOfIntegers {
	private int [] elements;
	private int size;
	public static final int DE=16;
	
	public StackOfIntegers(){
		this(DE);
	}
	public StackOfIntegers(int capacity){
		elements=new int[capacity];
	}
	public void push(int value){
		if(size>=elements.length){
			int []temp=new int[elements.length*2];
			System.arraycopy(elements, 0, temp, 0, elements.length);
			elements=temp;
		}
		elements[size++]=value;
	}
	public int pop(){
		return elements[--size];//ȡ��ջ��Ԫ�ز�ɾ��
	}
	public int peek(){
		return elements[size-1];//ȡ��ջ��Ԫ��
	}
	public boolean isEmpty(){//�ж�ջ�Ƿ�Ϊ��
		return size==0;
	}
	public int getSize(){//����ջ�Ĵ�С
		return size;
	}
}
