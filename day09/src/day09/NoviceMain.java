package day09;

public class NoviceMain {
	public static void main(String[] args) {
		Wizard wizard = new Wizard("해리포터",100,100);
		System.out.println(wizard.toString());
	}
}
class Novice{
	private String name;
	private int hp;
	
	public Novice(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}
	public String toString()
	{
		return String.format("%s(HP:%d), this.name, this.hp);
	}
}
class Wizard extends Novice{
	private int mp;

	public Wizard(String name, int hp, int mp) {
		super(name, hp);
		this.mp = mp;
	}
	public String toString()
	{
		return String.format("%s(HP:%d,MP:%d), this.name, this.hp, this.mp);
	}
}