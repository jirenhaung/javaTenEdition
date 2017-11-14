package 第三十章;
import java.util.concurrent.*;
public class AccountWithoutSync {
	private static Account account=new Account();
	public static void main(String[] args) {
		ExecutorService executor=Executors.newCachedThreadPool();
		for(int i=0;i<100;i++){
			executor.execute(new AddPennyTask());
		}
		executor.shutdown();
		
		while(!executor.isTerminated()){
		}
		System.out.println("what is balance? "+account.getBalance());
	}
	
	private static class AddPennyTask implements Runnable{
		public void run(){
			account.deposit(1);
		}
	}
	
	private static class Account{
		private int balance=0;
		public int getBalance(){
			return balance;
		}
		public /*synchronized*//*���Ա��⾺��״̬*/ void deposit(int amount){
			int newBalance=balance+amount;
			try {
				Thread.sleep(3);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
			balance=newBalance;
		}
	}
}
