package day06;

public class Create {
	public static void main(String[] args) {
		//생성자를 통한 객체 값 초기화
		Hero h1 = new Hero(); // null, 0을 만들어줌 -> name : 쥬리오, hp : 100
		h1.name = "쥬리오";
		h1.hp =100;
		h1.punch(); // 위에 h1 만든거를 호출함
		
		Hero h2 = new Hero("간달표",80); // 객체를 생성 -> 초기화 -> 생성자를 통해서 
		h2.punch();  // name : 간달표 , hp : 80
	}

}
class Hero{
	String name;
	int hp;
	
	// 생성자
	//1.특징 : 리턴 타입 명시가 없는 메소드
	//2.특징 : 이름이 클래스명과 같다.
	
	// h1
	Hero()
	{
		// 아무것도 안하는 객체를 생성해줌
	}
	// h2
	Hero(String _name,int _hp)
	{
		name = _name;
		hp = _hp;
	}
	void punch()
	{
		System.out.printf("[%s]의 펀치\n",name);
	}
}