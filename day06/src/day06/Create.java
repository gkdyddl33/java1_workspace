package day06;

public class Create {
	public static void main(String[] args) {
		//�����ڸ� ���� ��ü �� �ʱ�ȭ
		Hero h1 = new Hero(); // null, 0�� ������� -> name : �긮��, hp : 100
		h1.name = "�긮��";
		h1.hp =100;
		h1.punch(); // ���� h1 ����Ÿ� ȣ����
		
		Hero h2 = new Hero("����ǥ",80); // ��ü�� ���� -> �ʱ�ȭ -> �����ڸ� ���ؼ� 
		h2.punch();  // name : ����ǥ , hp : 80
	}

}
class Hero{
	String name;
	int hp;
	
	// ������
	//1.Ư¡ : ���� Ÿ�� ��ð� ���� �޼ҵ�
	//2.Ư¡ : �̸��� Ŭ������� ����.
	
	// h1
	Hero()
	{
		// �ƹ��͵� ���ϴ� ��ü�� ��������
	}
	// h2
	Hero(String _name,int _hp)
	{
		name = _name;
		hp = _hp;
	}
	void punch()
	{
		System.out.printf("[%s]�� ��ġ\n",name);
	}
}