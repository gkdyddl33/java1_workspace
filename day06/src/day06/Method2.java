package day06;

public class Method2 {
	// int x 파라미터를 가지고 있음.
	public static void printSquare(int x)
	{
		System.out.println(x * x);
	}
	
	// 프로그램의 시작점
	public static void main(String[] args) {
		// 단일 파라미터
		int value = 2;
		printSquare(value); // 메소드() 호출
		printSquare(3);
		printSquare(value * 2);
		
	}

}
