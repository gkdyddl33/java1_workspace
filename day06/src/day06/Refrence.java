package day06;

public class Refrence {
	public static void main(String[] args) {
		// �����ϱ� �纻�ϱ�
		
		// �⺻��
		int money1 = 10000;
		System.out.println(money1 + "->"); // 10000 ->
		zero(money1);
		System.out.println(money1);
		
		// ���۷���
		Money money2 = new Money(10000); 
		System.out.println(money2.getWon()+"->"); // money2 -> won : 10000
		zero(money2);
		System.out.println(money2.getWon());
	}
	public static void zero(int d)
	{
		d=0; // d = 0; , money �� 0�� �Ȱ��� �ƴ� �纻�� �������� ����
	}
	public static void zero(Money m)
	{
		m.won = 0; // m. -> m�� ����Ų��. m = 0
	}
}
class Money{
	int won;
	Money(int w)
	{
		won = w;
	}
	public int getWon()
	{
		return won;
	}
}