package day06;

public class Refrence {
	public static void main(String[] args) {
		// 원본일까 사본일까
		
		// 기본형
		int money1 = 10000;
		System.out.println(money1 + "->"); // 10000 ->
		zero(money1);
		System.out.println(money1);
		
		// 레퍼런스
		Money money2 = new Money(10000); 
		System.out.println(money2.getWon()+"->"); // money2 -> won : 10000
		zero(money2);
		System.out.println(money2.getWon());
	}
	public static void zero(int d)
	{
		d=0; // d = 0; , money 가 0이 된것이 아님 사본을 가져오는 것임
	}
	public static void zero(Money m)
	{
		m.won = 0; // m. -> m이 가르킨다. m = 0
	}
}
class Money{
	int won;
	Money(int w)
	{
		won = w;
	}
	public int getWon()
	{
		return won;
	}
}