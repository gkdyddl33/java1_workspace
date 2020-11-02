package day09;

public class ExtendEx3 {
	public static void main(String[] args) {
		Car c = new Car("자동차",2000);
		Truck t = new Truck("트럭",3000,1.5);
		SportCar s = new SportCar("스포츠카",6200,340);
		
		// 크락션울리기
		c.klaron();
		t.klaron();
		s.klaron();
	}
}
class Car{
	private String name;
	private int displacement; // 배기량
	
	//생성자를 만들어야 호출이 됨
	public Car(String name,int displacement)
	{
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
	
	public Truck(String name,int displacement,double ton)
	{
		// 자식클래스를 사용하기 위해서 부모 객체가 생성되야함
		super(name,displacement);
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

class SportCar extends Car{
	private double maxSpeed;
	public SportCar(String name,int displacement,double maxSpeed)
	{
		// 자식클래스를 사용하기 위해서 부모 객체가 생성되야함
		// super = 부모생성자
		super(name,displacement);
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
