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
		System.out.println("ù��° ��:");
		int a = sc.nextInt();
		
		System.out.println("�ι�° ��:");
		int b = sc.nextInt();
		
		System.out.printf("�� ���� ��:"+(a+b));
	}
}
