package day09;

public class Public {
	public static void main(String[] args) {
		Account myAccount = new Account(5000);
		User.check(myAccount);
	}
}

class Account{
	// private 선언된 필드
	private int balance;
	
	public Account(int balance)
	{
		this.balance = balance;
	}
	// getter메소드를 작성(이 부분으로 해결가능)
	public int getBalance()
	{
		return this.balance;
	}
}

// private로 인해 접근이 불가능해짐
// 근데 풀면은 안된다. 해커가 접근하기 때문에
class User{
	public static void check(Account account)
	{
		// 해당 메소드를 구현하시오.
		System.out.printf("현재 잔액:%d원\n",account.getBalance());
	}
}