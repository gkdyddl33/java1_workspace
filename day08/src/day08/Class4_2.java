package day08;

public class Class4_2 {
	public static void main(String[] args) {
		Test.m1();
		
		Test t = new Test();
		t.m2();
		t.m1();
	}
}
class Test{
	static void m1()
	{
		System.out.println("��ƿ��Ƽ�� �޼ҵ� ȣ��");
	}
	
	void m2()
	{
		System.out.println("�Ϲ� �޼ҵ� ȣ��");
	}
}
