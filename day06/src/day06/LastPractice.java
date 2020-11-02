package day06;

public class LastPractice {
	public static void main(String[] args) {
		// ���� ��������
		
		// �� ���� ��ü�� ����
		Hero arthas = new Hero("�Ƽ���");
		Hero leona = new Hero("������");
		
		// ��������
		Hero.battle(arthas,leona);
	}
}
class Hero
{
	// �ʵ�����
	String name;
	int hp = 30;
	
	// ����������
	Hero(String name)
	{
		this.name = name;
	}
	
	// Ŭ������ ��ġ �޼ҵ� ����
	void punch(Hero enemy)
	{
		enemy.hp -= 10;
		System.out.printf("[%s]�� ��ġ\n",this.name);
		System.out.printf("[\t%s] : %d\n",enemy.name,enemy.hp);
	}
	
	// static�޼ҵ� battle ����
	static void battle(Hero a, Hero b)
	{
		// �� ���� ��� ü���� �����ִٸ�, ��� �ο��� ����
		while(a.hp > 0 && b.hp > 0) // �� ���� ü���� �����ִ�
		{
			// 1/2�л��� ����/���� ����
			Hero attacker , defender;
			if(Math.random() < 0.5)
			{
				attacker = a;
				defender = b;
			}
			else
			{
				attacker = b;
				defender = a;
			}
			
			// ����� ����
			attacker.punch(defender);
		}
	}
}
