package day06;

public class Class {
	public static void main(String[] args) {
		//�Ƶ����� ����
		// Ŭ������ ��ü����
		Burger b1 = new Burger(); // ���� ��ü�� �����.
	}

}
class Burger{
	// �ʵ� : ����
	String name;
	int price;
	
	//�޼ҵ� : ����
	void showInfo()
	{
		System.out.println(name+":"+price+"��");
	}
}
