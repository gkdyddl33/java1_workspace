package day09;

public class ExtendsEx1 {
	public static void main(String[] args) {
		Wizard wizard = new Wizard("해리포터",100,100);
		System.out.println(wizard.toString());
	}
}
// 부모 클래스
class Novice{
	// 필드
	private String name;
	private int hp;
	
	// 생성자
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

// 자식클래스
class Wizard extends Novice{ // 자식클래스 extends 부모클래스 -> 상속
	
	private int mp;
	
	// 생성자
	public Wizard(String name,int hp,int mp)
	{
		// 상속을 받았기 때문에 변수는 새로 필요한 변수만 만들고
		// super로 그것을 맨위에 표현해준다.
		super(name,hp);
		this.mp = mp;
	}
	
}