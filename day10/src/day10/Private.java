package day10;

import java.util.concurrent.SynchronousQueue;

public class Private {
	public static void main(String[] args) {
		Account myAccount = new Account(1000000);
		User.deposit(myAccount, 7000);
		User.check(myAccount);
		Hocker.malcious(myAccount);
		System.out.println(myAccount);
	}
}

class Account{
	private int balance; // ÀÜ¾×º¯¼ö
	public Account(int balance)
	{
		this.balance = balance;
	}
	
	public int getBalance() {
		return this.balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String toString()
	{
		return "Account [balance = "+balance+"]";
	}
}
class User{
	public static void check(Account account)
	{
		System.out.printf("ÇöÀç ÀÜ¾×:%d¿ø\n",account.getBalance());
	}
	public static void deposit(Account account,int amount)
	{
		int bal = account.getBalance();
		account.setBalance(bal+amount);
	}
}
class Hocker{
	public static void malcious(Account account)
	{
		account.balance = 0;
	}
}