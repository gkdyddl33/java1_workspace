package day06;

public class Method6 {
	public static void printSquare(int x) // x = 5
	{
		System.out.println("printSquare x ="+ x); // x = 5
		x = x * x;                                // x = 25
		System.out.println("printSquare x ="+ x); // x = 25
	}
	public static void main(String[] args) {
		// 변수의 스코프
		int x = 5;
		System.out.println("main x ="+ x); // 5
		printSquare(x);
		System.out.println("main x ="+ x); // x = 25
	}

}
