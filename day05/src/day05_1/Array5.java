package day05_1;

import java.util.Scanner;

public class Array5 {
	public static int max(int a,int b)
	{
		return (a>b)? a : b;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �迭�� ũ�⸦ �Է��ϼ���:");
		int number = sc.nextInt();
		
		int[] arr = new int[number];
		for (int i = 0; i < arr.length; i++) {
			System.out.print("�迭�� �Է��� ������ �ϳ��� �Է��ϼ���:");
			arr[i] = sc.nextInt();
		}
		
		int result = -1;
		for (int i = 0; i < number; i++) {
			result = max(result,arr[i]);
		}
		System.out.println("�Է��� ��� ���� �߿��� ���� ū����"+result+"�Դϴ�.");
	}

}
