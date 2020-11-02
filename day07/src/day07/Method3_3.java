package day07;

public class Method3_3 {
	public static void printSquare(int x)
	{
		System.out.println("printSquare x ="+x);
		x=x*x; // 값 변경하기
		System.out.println("printSquare x ="+x);
	}
	public static void main(String[] args) {
		int x = 5;
		System.out.println("main x ="+x); // 5
		printSquare(x);
		System.out.println("main x ="+x); // 5
	}

}
