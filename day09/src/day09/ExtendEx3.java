package day09;

public class ExtendEx3 {
	public static void main(String[] args) {
		Car c = new Car("�ڵ���",2000);
		Truck t = new Truck("Ʈ��",3000,1.5);
		SportCar s = new SportCar("������ī",6200,340);
		
		// ũ���ǿ︮��
		c.klaron();
		t.klaron();
		s.klaron();
	}
}
class Car{
	private String name;
	private int displacement; // ��ⷮ
	
	//�����ڸ� ������ ȣ���� ��
	public Car(String name,int displacement)
	{
		this.name = name;
		this.displacement = displacement;
		
	}
	public void klaron()
	{
		System.out.println("�֍�!");
	}
}

class Truck extends Car{
	private double ton;
	
	public Truck(String name,int displacement,double ton)
	{
		// �ڽ�Ŭ������ ����ϱ� ���ؼ� �θ� ��ü�� �����Ǿ���
		super(name,displacement);
		this.ton = ton;		
	}
	
	public void load()
	{
		System.out.println("���Ǳ�!");
	}
	public void klaron()
	{
		System.out.println("����!");
	}
}

class SportCar extends Car{
	private double maxSpeed;
	public SportCar(String name,int displacement,double maxSpeed)
	{
		// �ڽ�Ŭ������ ����ϱ� ���ؼ� �θ� ��ü�� �����Ǿ���
		// super = �θ������
		super(name,displacement);
		this.maxSpeed = maxSpeed;		
	}
	
	public void drive()
	{
		System.out.println("����̺��ϱ�!");
	}
	public void klaron()
	{
		System.out.println("�ѿ;Ӻ���!");
	}
}
