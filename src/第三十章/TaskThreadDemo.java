package 第三十章;

public class TaskThreadDemo {
	public static void main(String[] args) {
		Runnable printA=new PrintChar('a', 100);
		Runnable printB=new PrintChar('b', 100);
		Runnable printC=new PrintNum(100);
		Thread thread1=new Thread(printA);
		Thread thread2=new Thread(printB);
		Thread thread3=new Thread(printC);
		thread1.start();
		thread2.start();
		thread3.start();
		//thread1.run();
		//thread2.run();
		//thread3.run();
	}
}
class PrintChar implements Runnable{
	private char charToPoint;
	private int time;
	
	public PrintChar(char c,int t) {
		charToPoint=c;
		time=t;
	}
	@Override
	public void run(){
		for(int i=0;i<time;i++)
			System.out.print(charToPoint);
	}
}
class PrintNum implements Runnable{
	private int lastNum;
	public PrintNum(int n){
		lastNum=n;
	}
	@Override
	public void run(){
		for(int i=1;i<=lastNum;i++)
			System.out.print(" "+i);
	}
}
