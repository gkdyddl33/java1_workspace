package day09;

public class ExtendEx2 {
	public static void main(String[] args) {
		// 객체생성
		Novice chobo = new Novice("초보",100);
		Wizard wizard = new Wizard("해리포터",100,100);
		
		System.out.println(chobo.toString());
		System.out.println(wizard.toString());
	}
}

class Novice{
	// 필드
	// 접근제한자일종 : 상속관계사 공개 자식들한테 공개 : protected
	protected String name; 
	protected int hp;
	
	// 생성자
	// public 접근제한자 일종에서 공개를 의미
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