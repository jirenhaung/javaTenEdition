package 第十章;

import java.util.Scanner;

public class TestLoanClass {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter rate:");
		double annualInterestRate=input.nextDouble();
		System.out.print("Enter years:");
		int years=input.nextInt();
		System.out.print("Enter amount:");
		double amount=input.nextDouble();
		Loan loan=new Loan(annualInterestRate, years, amount);
		System.out.printf("The loan was created on %s\n"+"The monthlyPay is %.2f\n"+
		"The totalPay is %.2f\n",loan.getLoanDate().toString(),
		loan.getMonthlyPayment(),loan.getTotalPayment());
		//System.out.println(loan);
	}
}
