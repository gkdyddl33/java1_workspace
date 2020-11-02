package day08;

import java.util.Scanner;

public class MethodeEx1_1 {
	public static void main(String[] args) {
		System.out.println(sum1(10,20));
		sum2();
		
	}
	public static int sum1(int a,int b)
	{
		return a+b;
	}
	public static void sum2()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 수:");
		int a = sc.nextInt();
		
		System.out.println("두번째 수:");
		int b = sc.nextInt();
		
		System.out.printf("두 수의 합:"+(a+b));
	}
}
