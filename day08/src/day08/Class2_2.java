package day08;

public class Class2_2 {
	public static void main(String[] args) {
		Hero a = new Hero("아서스",30);
		Hero d = new Hero("디아블로",30);
		
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
		System.out.printf("[%s]의 펀치!\n",name);
		System.out.printf("\t%s hp : %d\n",enemy.name,enemy.hp);
	}
}
