package day09;

public class ExtendEx4 {
	public static void main(String[] args) {
		new B();
	}
}

class A{
	int i = 7;
	
	// ����Ʈ ������
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
		// super(); -> �θ�Ŭ������ ����Ʈ�����ڶ� �ڵ����� ȣ��!
		// �ƹ��͵� ��� �ڵ�ȣ���� �ȴٴ� �ǹ�.
		//System.out.println("i from B is"+i);
	}
	
	public void setI(int i)
	{
		this.i = 3 * i;
	}
}
