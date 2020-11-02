package day09;

public class ExtendEx5 {
	public static void main(String[] args) {
		Car c = new Car("ÀÚµ¿Â÷",2000);
		Truck t = new Truck("Æ®·°",3000,1.5);
		SportCar s = new SportCar("½ºÆ÷Ã÷Ä«",6200,340);
		
		c.klaron();
		t.klaron();
		s.klaron();
	}
}
class Car{
	private String name;
	private int displacement;
	public Car(String name, int displacement) {
		super();
		this.name = name;
		this.displacement = displacement;
	}
	public void klaron()
	{
		System.out.println("ÖÖ!");
	}
	
}
class Truck extends Car{
	private double ton;

	public Truck(String name, int displacement, double ton) {
		super(name, displacement);
		this.ton = ton;
	}
	
	public void load()
	{
		System.out.println("Áü½Ç±â!");
	}
	public void klaron()
	{
		System.out.println("»§»§!");
	}
}
class SportCar extends Car() {
	private double maxSpeed;


	public SportCar(String name, int displacement, double maxSpeed) {
		super(name, displacement);
		this.maxSpeed = maxSpeed;
	}
	public void drive()
	{
		System.out.println("µå¶óÀÌºêÇÏ±â!");
	}
	public void klaron()
	{
		System.out.println("»Ñ¿Í¾Óºü¾Ó!");
	}
}
