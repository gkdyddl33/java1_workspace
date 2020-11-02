package day06;

public class Create2 {
	public static void main(String[] args) {
		// 권투 게임
		Hero a = new Hero("아서스",30);
		
		Hero d = new Hero("디아블로",30);
		
		a.punch(d); // a가 d를 때리면
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
	
	// 타입으로써의 클래스 : 클래새는 사용자가 정의한 또 다른 타입이다.
	
	void punch(Hero enemy) // =d
	{
		enemy.hp -= 10;
		System.out.printf("[%s]의 펀치!\n",name);
		System.out.printf("\t%s HP : %d\n",enemy.name,enemy.hp);
	}
}