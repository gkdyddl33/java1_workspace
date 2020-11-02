package day06;

public class Class3 {
	public static void main(String[] args) {
		// 쥬리오의 펀치
		// 객체생성
		Hero h1 = new Hero();
		
		//객체값 초기화
		h1.name = "쥬리오";
		h1.hp=100;
		
		//객체에게 메소드를 수행
		h1.punch();
	}
}
class Hero{
	String name;
	int hp;
	
	void punch()
	{
		System.out.println(name+"의 펀치!");
	}
}
