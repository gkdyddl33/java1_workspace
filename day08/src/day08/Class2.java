package day08;

public class Class2 {
	public static void main(String[] args) {
		Hero h1 = new Hero();
		h1.name = "Áê¸®¿À";
		h1.hp=100;
		h1.punch();
		
		Hero h2 = new Hero("°£´ÞÇ¥",80);
		h2.punch();
		
	}
}
class Hero{
	String name;
	int hp;
	
	Hero()
	{
		
	}
	Hero(String _name,int _hp)
	{
		name = _name;
		hp = _hp;
	}
	void punch()
	{
		System.out.printf("[%s]ÀÇ ÆÝÄ¡\n",name);
	}
}
