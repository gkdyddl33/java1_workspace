package day06;

public class Umethod {
	public static void main(String[] args) {
		// static�޼ҵ�� �Ϲݸ޼ҵ��� ��
		Test.m1();
		
		Test t = new Test();
		t.m2(); // ��ü�� �����ؾ����� ȣ�Ⱑ��
		t.m1(); // ��ü�� �Ȱ����� ������ ������ ȣ�Ⱑ��
	}

}
class Test
{
	// static �޼ҵ�
	static void m1()
	{
		System.out.println("��ƿ��Ƽ�� �޼ҵ� ȣ��");
	}
	
	// �Ϲ� �޼ҵ�
	void m2()
	{
		System.out.println("�Ϲ� �޼ҵ� ȣ��");
	}
}
