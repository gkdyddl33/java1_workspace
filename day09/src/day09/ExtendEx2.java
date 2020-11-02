package day09;

public class ExtendEx2 {
	public static void main(String[] args) {
		// ��ü����
		Novice chobo = new Novice("�ʺ�",100);
		Wizard wizard = new Wizard("�ظ�����",100,100);
		
		System.out.println(chobo.toString());
		System.out.println(wizard.toString());
	}
}

class Novice{
	// �ʵ�
	// �������������� : ��Ӱ���� ���� �ڽĵ����� ���� : protected
	protected String name; 
	protected int hp;
	
	// ������
	// public ���������� �������� ������ �ǹ�
	public Novice(String name,int hp)
	{
		this.name = name;
		this.hp = hp;
	}
	
	// toString
	public String toString()
	{
		return String.format("[Novice]%s(HP:%d)", this.name,this.hp);		
	}
}
class Wizard extends Novice{
	protected int mp;
	
	public Wizard(String name,int hp,int mp)
	{
		super(name,hp);
		this.mp = mp;
	}
	public String toString()
	{
		return String.format("[Wizard]%s(HP:%d, HP:%d)", this.name,this.hp,this.mp);
	}
}