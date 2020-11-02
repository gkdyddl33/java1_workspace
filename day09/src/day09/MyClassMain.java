package day09;

public class MyClassMain {
	public static void main(String[] args) {
		TestA ta1 = new TestA(10,20,30);
		
		TestA ta2 = new TestA();
		
		//System.out.println(ta.a);
		//System.out.println(ta.b);
		//System.out.println(ta.c);
		
		System.out.println(ta1.a);
		System.out.println(ta2.a);
		ta2.a=30;
		System.out.println(ta1.a);
		System.out.println(ta1.b);
		System.out.println(ta2.b); // 디폴트 지정을 안함 = 0
		System.out.println(ta1.c);
		System.out.println(ta2.c); // 디폴트 지정을 안함 = 0
		
	}

}
class TestA{
	static int a;
	int b;
	int c;
	
	// 생성자
	TestA()
	{
		System.out.println("TestA() 디폴트 생성자 호출!");
	}
	
	// 매개변수 생성자
	TestA(int a,int b,int c)
	{
		System.out.println("TestA() 매개변수 생성자 호출!");
		this.a=a;
		this.b=b;
		this.c=c;
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
