package day08;

public class Class2_2 {
	public static void main(String[] args) {
		Hero a = new Hero("�Ƽ���",30);
		Hero d = new Hero("��ƺ��",30);
		
		a.punch(d);
		a.punch(a);
		a.punch(a);
		a.punch(d);
	}
}

class Hero{
	String name;
	int hp;
	
	Hero(String _name, int _hp)
	{
		name = _name;
		hp = _hp;
	}
	
	void punch(Hero enemy)
	{
		enemy.hp -= 10;
		System.out.printf("[%s]�� ��ġ!\n",name);
		System.out.printf("\t%s hp : %d\n",enemy.name,enemy.hp);
	}
}
