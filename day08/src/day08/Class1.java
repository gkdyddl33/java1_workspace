package day08;

public class Class1 {
	public static void main(String[] args) {
		Burger b1 = new Burger();
		b1.name="�������丶��𷰽�";
		b1.price=7500;
		
	}
}
class Burger{
	String name;
	int price;
	
	void showInfo()
	{
		System.out.println(name+":"+price+"��");
	}
}
