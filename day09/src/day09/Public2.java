package day09;

public class Public2 {
	public static void main(String[] args) {
		// �ܾ��� ������� ���
		// setter�� �ذ��ϱ� ����� �ʵ带 �����ϴ� �޼ҵ�
		Account myAccount = new Account(5000);
		User.deposit(myAccount,7000); // �Ա� 5000 + 7000
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
	public void setBalance(int balance)
	{
		// �Ű������� �����ϴ� ��ġ�� ��ǻ�Ͱ� �������� ���
		// this��� Ű���带 ���ؼ� ������ ���� ����.
		this.balance = balance;
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
	public static void deposit(Account account,int amount)
	{
		// �ش� �޼ҵ带 �����Ͻÿ�.
		// �Ʒ�ó�� �ڵ带 ���������� �����Ҽ��� ���� private������
		// account.balance += amount;
		// ���������� �ؾߵȴ�.
		int bal = account.getBalance();
		// ������ + ���ο� ��
		account.setBalance(bal + amount);
	}
}