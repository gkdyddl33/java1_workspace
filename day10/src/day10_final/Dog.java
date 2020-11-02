package day10_final;

public class Dog extends Animal{
	public Dog() {}
	
	public Dog(String name,int hp,String feed,int feedCnt)
	{
		super(name,hp,feed,feedCnt);
	}
	
	@Override
	public boolean eat() {
		if(super.eat())
		{
			hp++;
			return true;
		}
		return false;
	}
}
