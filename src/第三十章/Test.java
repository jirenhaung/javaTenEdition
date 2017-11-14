package 第三十章;

public class Test implements Runnable{
	public static void main(String[] args) {
		new Thread(new Test()).start();
	}
	public Test(){
		//Test task=new Test();
		//new Thread(this).start();
	}
	public void run(){
		System.out.println("test");
	}
}
