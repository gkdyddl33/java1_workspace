package day06;

public class Create2 {
	public static void main(String[] args) {
		// ���� ����
		Hero a = new Hero("�Ƽ���",30);
		
		Hero d = new Hero("��ƺ��",30);
		
		a.punch(d); // a�� d�� ������
		d.punch(a);
		d.punch(a);
		a.punch(d);
	}

}

class Hero {
	String name;
	int hp;

	Hero(String _name, int _hp) {
		name = _name;
		hp = _hp;
	}
	
	// Ÿ�����ν��� Ŭ���� : Ŭ������ ����ڰ� ������ �� �ٸ� Ÿ���̴�.
	
	void punch(Hero enemy) // =d
	{
		enemy.hp -= 10;
		System.out.printf("[%s]�� ��ġ!\n",name);
		System.out.printf("\t%s HP : %d\n",enemy.name,enemy.hp);
	}
}