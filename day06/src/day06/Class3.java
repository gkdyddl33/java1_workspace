package day06;

public class Class3 {
	public static void main(String[] args) {
		// �긮���� ��ġ
		// ��ü����
		Hero h1 = new Hero();
		
		//��ü�� �ʱ�ȭ
		h1.name = "�긮��";
		h1.hp=100;
		
		//��ü���� �޼ҵ带 ����
		h1.punch();
	}
}
class Hero{
	String name;
	int hp;
	
	void punch()
	{
		System.out.println(name+"�� ��ġ!");
	}
}
