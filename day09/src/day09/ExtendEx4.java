package day09;

public class ExtendEx4 {
	public static void main(String[] args) {
		new B();
	}
}

class A{
	int i = 7;
	
	// 디폴트 생성자
	public A() {
		setI(20);
		System.out.println("i from A is"+i);
	}
	
	public void setI(int i)
	{
		this.i = 2 * i;
	}
}
class B extends A{
	public B()
	{
		// super(); -> 부모클래스가 디폴트생성자라서 자동으로 호출!
		// 아무것도 없어도 자동호출이 된다는 의미.
		//System.out.println("i from B is"+i);
	}
	
	public void setI(int i)
	{
		this.i = 3 * i;
	}
}
