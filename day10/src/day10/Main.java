package day10;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("�ٳ���:1, ������:2 ?");
		int input = sc.nextInt();
		Polymorphism pol;
		
		if(input == 1)
		{
			pol = new Banana();
			pol.show();
		}
		else if(input == 2)
		{
			pol = new Peach();
			pol.show();
		}
		
		//Polymorphism pol = new Peach(); // new Banana()
		//pol.show();
		
		// ���� ���, ������ ���� ����ִ�.
		// �θ�Ŭ������ ���� ���� �ڽ�Ŭ������ ���� �ü� ��� ������
		// ������ �� �ִ�.
		
}

}
