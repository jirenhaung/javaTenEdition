package 第三十章;
import java.util.concurrent.*;
public class Exucutor {
	public static void main(String[] args) {
		ExecutorService executor=Executors.newFixedThreadPool(3);//��Ϊ1����˳��ִ��
		//ExecutorService executor=Executors.newCachedThreadPool();//�������񲢷�ִ��
		executor.execute(new PrintNum(100));
		
		executor.execute(new PrintChar('a', 100));
		
		executor.execute(new PrintChar('b', 100));
		
		executor.shutdown();
	}
}
