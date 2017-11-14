package 第三十章;

import java.util.concurrent.*;
import java.util.concurrent.locks.*;
public class ThreadCooperation {
	private static Account account=new Account();
	
	public static void main(String[] args) {
		ExecutorService executor=Executors.newFixedThreadPool(2);
		System.out.println("Thread 1\t\tThread 2\t\tBalance");
		executor.execute(new DepositTask());
		executor.execute(new WithdrawTask());
		executor.shutdown();
		
		
	}
	
	public static class DepositTask implements Runnable{
		@Override
		public void run(){
			try{
				while(true){
					account.deposit((int)(Math.random()*10)+1);
					Thread.sleep(1000);//in order to let withdraw run
				}
			}catch (InterruptedException e) {
				e.printStackTrace();// TODO: handle exception
			}
		}
	}
	public static class WithdrawTask implements Runnable{
		@Override
		public void run(){
			while(true){
				account.withdraw((int)(Math.random()*10)+1);
			}
		}
	}
	
	private static class Account{
		private static Lock lock=new ReentrantLock();//create a lock
		private static Condition newDeposit=lock.newCondition();
		private int balance=0;//total
		
		public int getBalance(){
			return balance;
		}
		
		public void withdraw(int amount){
			lock.lock();//acquire the lock
			try{
				while(balance<amount){// can't use if statement,because 
					//after deposit balance,the balance also maybe less than amount
					System.out.println("\t\t\tAmount "+amount+" is bigger than Balance "+balance);
					System.out.println("\t\t\tWait for a deposit");
					newDeposit.await();
				}
			balance-=amount;
			System.out.println("\t\t\tWithdraw "+amount+"\t\t"+getBalance());
			}catch (InterruptedException e) {
				e.printStackTrace();// TODO: handle exception
			}
			finally {
				lock.unlock();//release the lock
			}
		}
		
		public void deposit(int amount){
			lock.lock();
			try {
				balance+=amount;
				System.out.println("Deposit "+amount+"\t\t\t\t\t"+getBalance());
				newDeposit.signalAll();
			} finally {
				lock.unlock();// TODO: handle finally clause
			}
		}
	}
}
