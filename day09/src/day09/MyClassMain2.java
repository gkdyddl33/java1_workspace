package day09;

public class MyClassMain2 {
	public static void main(String[] args) {
		TestA ta1 = new TestA(10,20,30);
		TestA ta2 = new TestA();
		
		System.out.println(ta1.a);
		System.out.println(ta2.a);
	}

}
class TestA{
	static int a;
	int b;
	int c;
	TestA
	{
		System.out.println("TestA() ����Ʈ ������ ȣ��!");
	}
	TestA(int a,int b,int c)
	{
		System.out.println("TestA() �Ű����� ������ ȣ��!");
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