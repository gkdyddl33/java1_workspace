package day0808;

import java.util.Scanner;

public class MethodEx1 {
	public static void main(String[] args) {
		System.out.println(sum1(10,20));
		sum2();
	}
	//(1)
	public static int sum1(int a,int b) {
		return a+b;
	}
	//(2)
	public static void sum2() {
		Scanner sc = new Scanner(System.in);
		 
		System.out.print("첫번째 수:");
		int a = sc.nextInt();
		System.out.print("두번째 수:");
		int b = sc.nextInt();
		System.out.println("두 수의 합:"+(a+b));
	}
}
