package day06;

public class Class {
	public static void main(String[] args) {
		//맥도날드 버거
		// 클래스로 객체생성
		Burger b1 = new Burger(); // 버거 객체를 만든다.
	}

}
class Burger{
	// 필드 : 정보
	String name;
	int price;
	
	//메소드 : 동작
	void showInfo()
	{
		System.out.println(name+":"+price+"원");
	}
}
