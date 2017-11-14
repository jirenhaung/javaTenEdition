package 第二十四章;

public interface MyList<E> extends java.lang.Iterable<E> {
	public void add(E e);//�����Ա�ĩ�����һ��Ԫ��
	
	public void add(int index,E e);//��ָ��λ�ò���һ��Ԫ��
	
	public void clear();//ɾ������Ԫ��
	
	public boolean contains(E e);//�������ָ��Ԫ�أ�������
	
	public E get(int index);//����ָ���±��Ԫ��
	
	public int indexOf(E e);//���ص�һ��ƥ��Ԫ�ص��±�
	
	public boolean isEmpty();//����������κ�Ԫ�أ�������
	
	public int lastIndexOf(E e);//�������һ��ƥ��Ԫ�ص��±�
	
	public boolean remove(E e);//ɾ��Ԫ��
	
	public E remove(int index);//ɾ��ָ���±��Ԫ�ز����ظ�Ԫ��
	
	public Object set(int index,E e);//��ָ���±�����һ��Ԫ�أ������ر������Ԫ��
	
	public int size();//���ر��С
}
