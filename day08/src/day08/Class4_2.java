package day08;

public class Class4_2 {
	public static void main(String[] args) {
		Test.m1();
		
		Test t = new Test();
		t.m2();
		t.m1();
	}
}
class Test{
	static void m1()
	{
		System.out.println("유틸리티의 메소드 호출");
	}
	
	void m2()
	{
		System.out.println("일반 메소드 호출");
	}
}
