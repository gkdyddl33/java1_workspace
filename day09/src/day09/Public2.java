package day09;

public class Public2 {
	public static void main(String[] args) {
		// 잔액이 비공개일 경우
		// setter로 해결하기 비공개 필드를 변경하는 메소드
		Account myAccount = new Account(5000);
		User.deposit(myAccount,7000); // 입금 5000 + 7000
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
	public void setBalance(int balance)
	{
		// 매개변수가 동일하다 겹치면 컴퓨터가 읽을수가 없어서
		// this라는 키워드를 통해서 구분할 수가 있음.
		this.balance = balance;
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
	public static void deposit(Account account,int amount)
	{
		// 해당 메소드를 구현하시오.
		// 아래처럼 코드를 직접적으로 접근할수가 없음 private때문에
		// account.balance += amount;
		// 간접접근을 해야된다.
		int bal = account.getBalance();
		// 기존값 + 새로운 값
		account.setBalance(bal + amount);
	}
}