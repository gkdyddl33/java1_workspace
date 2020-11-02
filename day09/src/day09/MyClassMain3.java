package day09;

public class MyClassMain3 {
	public static void main(String[] args) {
		TestA ta = new TestA(10,20,30);
		
		System.out.println(ta.a);
		System.out.println(ta.b);
		System.out.println(ta.c);
		
		TestA ta2 = new TestA();
		ta2.a = 40;
		ta2.b = 50;
		ta2.c = 60;
		
		System.out.println(ta2.a);
		System.out.println(ta2.b);
		System.out.println(ta2.c);
		
		ta.f1();
		ta2.f2();
	}

}

class TestA{
	static int a;
	int b;
	int c;
	
	TestA()
	{
		System.out.println("TestA() 디폴트 생성자 호출!");
	}

	TestA(int a, int b, int c) {
		System.out.println("TestA() 매개변수 생성자 호출!");
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	void f1()
	{
		System.out.println("f1()");
	}
	void f2()
	{
		System.out.println("f2()");
	}
}