package 第九章;
import java.util.Date;

//import charpter9.Account;
public class pro_7 {
	public static void main(String[] args) {
		 Account account = new Account(1122, 20000);
		    Account.setAnnualInterestRate(4.5);
		    
		    account.withdraw(2500);
		    account.deposit(3000);
		    System.out.println("Balance is " + account.getBalance());
		    System.out.println("Monthly interest is " +
		      account.getMonthlyInterest());
		    System.out.println("This account was created at " +
		      account.getDateCreated());
	}
}
class Account{
	private int id=0;
	private double balance=0;
	private static double annualInterestRate=0;
	private Date dateCreated;
	public Account(){
		dateCreated = new Date();
	}
	public Account(int id,double balance){
		dateCreated = new Date();
		this.id=id;
		this.balance=balance;
	}
	public int getId() {
	    return this.id;
	  }

	  public double getBalance() {
	    return balance;
	  }
	  public static double getAnnualInterestRate() {
	    return annualInterestRate;
	  }
	  public void setId(int newId) {
		    id = newId;
		  }

	  public void setBalance(double newBalance) {
		    balance = newBalance;
		  }

	  public static void setAnnualInterestRate(double newAnnualInterestRate) {
		    annualInterestRate = newAnnualInterestRate;
		  }
	  public double getMonthlyInterest() {
		    return balance * (annualInterestRate / 1200);
		  }
	  public Date getDateCreated() {
		    return dateCreated;
		  }
	  public void withdraw(double amount) {
		    balance -= amount;
		  }

	  public void deposit(double amount) {
		    balance += amount;
		  }
}