package day06;

public class Method5 {
	// x * x를 반환
	public static double square(double x)
	{
		return x * x; // 타입이 있는 경우 반환처리 됨
	}
	public static void main(String[] args) {
		// 리턴 값이 있는 메소드
		System.out.println(square(5)); // 파라미터 x 로 대입
		System.out.println(square(2));
	}

}
