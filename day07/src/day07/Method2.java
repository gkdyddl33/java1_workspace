package day07;

public class Method2 {
	public static void printSquare(int x)
	{
		System.out.println(x*x);
	}
	public static void main(String[] args) {
		int values = 2;
		printSquare(values);   // 4
		printSquare(3);        // 9
		printSquare(values*2); // 16
	}

}
