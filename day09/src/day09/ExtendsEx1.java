package day09;

public class ExtendsEx1 {
	public static void main(String[] args) {
		Wizard wizard = new Wizard("�ظ�����",100,100);
		System.out.println(wizard.toString());
	}
}
// �θ� Ŭ����
class Novice{
	// �ʵ�
	private String name;
	private int hp;
	
	// ������
	public Novice(String name,int hp)
	{
		this.name = name;
		this.hp = hp;
	}
	
	// toString
	public String toString()
	{
		return String.format("%s(HP:%d)", this.name,this.hp);
	}
}

// �ڽ�Ŭ����
class Wizard extends Novice{ // �ڽ�Ŭ���� extends �θ�Ŭ���� -> ���
	
	private int mp;
	
	// ������
	public Wizard(String name,int hp,int mp)
	{
		// ����� �޾ұ� ������ ������ ���� �ʿ��� ������ �����
		// super�� �װ��� ������ ǥ�����ش�.
		super(name,hp);
		this.mp = mp;
	}
	
}