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
		System.out.println(ta2.b); // ����Ʈ ������ ���� = 0
		System.out.println(ta1.c);
		System.out.println(ta2.c); // ����Ʈ ������ ���� = 0
		
	}

}
class TestA{
	static int a;
	int b;
	int c;
	
	// ������
	TestA()
	{
		System.out.println("TestA() ����Ʈ ������ ȣ��!");
	}
	
	// �Ű����� ������
	TestA(int a,int b,int c)
	{
		System.out.println("TestA() �Ű����� ������ ȣ��!");
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
