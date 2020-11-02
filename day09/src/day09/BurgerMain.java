package day09;

public class BurgerMain {
	public static void main(String[] args) {
		Burger b1 = new Burger();
		b1.name = "베이컨디럭스";
		b1.price = 7900;
		b1.showInfo();
	}
}
class Burger{
	String name;
	int price;
	
	void showInfo()
	{
		System.out.println(name+":"+price+"원");
	}
}
