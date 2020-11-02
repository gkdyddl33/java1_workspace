package day09;

public class ExtendEx5 {
	public static void main(String[] args) {
		Car c = new Car("자동차",2000);
		Truck t = new Truck("트럭",3000,1.5);
		SportCar s = new SportCar("스포츠카",6200,340);
		
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
		System.out.println("띡띡!");
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
		System.out.println("짐실기!");
	}
	public void klaron()
	{
		System.out.println("빵빵!");
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
		System.out.println("드라이브하기!");
	}
	public void klaron()
	{
		System.out.println("뿌와앙빠앙!");
	}
}
