package day06;

public class Umethod {
	public static void main(String[] args) {
		// static메소드와 일반메소드의 비교
		Test.m1();
		
		Test t = new Test();
		t.m2(); // 객체를 생성해야지만 호출가능
		t.m1(); // 객체를 안가져도 되지만 가져도 호출가능
	}

}
class Test
{
	// static 메소드
	static void m1()
	{
		System.out.println("유틸리티의 메소드 호출");
	}
	
	// 일반 메소드
	void m2()
	{
		System.out.println("일반 메소드 호출");
	}
}
