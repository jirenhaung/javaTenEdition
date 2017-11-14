package 第十二章;

public class TestCircleWithException {
	public static void main(String[] args) {
		try{
			CircleWithException c1=new CircleWithException(5);
			CircleWithException c2=new CircleWithException(-5);
			//�����쳣ֱ����ת��catch�飬��ִ���������䡣
			CircleWithException c3=new CircleWithException(0);
		}
		catch(IllegalArgumentException ex){
			System.out.println(ex);
		}
		System.out.println("Number of Objects created : "+
		CircleWithException.getNumberIfObjects());
	}
}
