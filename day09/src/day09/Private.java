package day09;

public class Private {
	// 해커를 막아라.
	public static void main(String[] args) {
		Account myAccount = new Account(1000000);
		System.out.println(myAccount); // 1,000,000
		Hocker.malcious(myAccount);
		System.out.println(myAccount); // 0
	}
}

// 계좌정보
class Account{
	// 해커가 접근을 하지 못하도록 금액을 수정을 하지 못하도록 제어자를 적음
	private int balance; // 잔액변수
	public Account(int balance)
	{
		this.balance = balance;
	}
	
	public String toString()
	{
		return "Account [balance = " + balance + "]";
	}
}

// 해커 클래스 -> 계좌잔액을 0원으로 변경하고 있음. 얼마가 있든간에 0원으로
class Hocker{
	public static void malcious(Account account)
	{
		account.balance = 0;
	}
}