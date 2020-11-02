package day09;

public class Private {
	// ��Ŀ�� ���ƶ�.
	public static void main(String[] args) {
		Account myAccount = new Account(1000000);
		System.out.println(myAccount); // 1,000,000
		Hocker.malcious(myAccount);
		System.out.println(myAccount); // 0
	}
}

// ��������
class Account{
	// ��Ŀ�� ������ ���� ���ϵ��� �ݾ��� ������ ���� ���ϵ��� �����ڸ� ����
	private int balance; // �ܾ׺���
	public Account(int balance)
	{
		this.balance = balance;
	}
	
	public String toString()
	{
		return "Account [balance = " + balance + "]";
	}
}

// ��Ŀ Ŭ���� -> �����ܾ��� 0������ �����ϰ� ����. �󸶰� �ֵ簣�� 0������
class Hocker{
	public static void malcious(Account account)
	{
		account.balance = 0;
	}
}