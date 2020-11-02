package day09;

public class Public {
	public static void main(String[] args) {
		Account myAccount = new Account(5000);
		User.check(myAccount);
	}
}

class Account{
	// private ����� �ʵ�
	private int balance;
	
	public Account(int balance)
	{
		this.balance = balance;
	}
	// getter�޼ҵ带 �ۼ�(�� �κ����� �ذᰡ��)
	public int getBalance()
	{
		return this.balance;
	}
}

// private�� ���� ������ �Ұ�������
// �ٵ� Ǯ���� �ȵȴ�. ��Ŀ�� �����ϱ� ������
class User{
	public static void check(Account account)
	{
		// �ش� �޼ҵ带 �����Ͻÿ�.
		System.out.printf("���� �ܾ�:%d��\n",account.getBalance());
	}
}