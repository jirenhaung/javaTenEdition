package 第三十章;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
public class AccountWithSyncUsingLock {
	private static Account account=new Account();
	public static void main(String[] args) {
		ExecutorService executor=Executors.newCachedThreadPool();
		for(int i=0;i<100;i++){
			executor.execute(new AddPennyTask());
		}
		executor.shutdown();
		while(!executor.isTerminated()){
		}//wait until all tasks are finshed
		System.out.println("what is balance? "+account.getBalance());
	}
	public static class AddPennyTask implements Runnable{
		public void run(){
			account.deposit(1);
		}
	}
	public static class Account{
		private static Lock lock=new ReentrantLock();
		private int balance=0;
		public int getBalance(){
			return balance;
		}
		public void deposit(int amount){
			lock.lock();//acquire a lock
			try {
				int newBalance=balance+amount;
				Thread.sleep(5);
				balance=newBalance;
				
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
			finally{
				lock.unlock();//release the lock
			}
		}
	}
}
