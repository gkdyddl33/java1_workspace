package day09;

public class HeroMain {
	public static void main(String[] args) {
		Hero h1 = new Hero();
		
		h1.name = "Áê¸®¿À";
		h1.hp = 100;
		
		h1.punch();
	}
}
class Hero{
	String name;
	int hp;
	
	void punch()
	{
		System.out.println(name+"ÀÇ ÆÝÄ¡!");
	}
}
