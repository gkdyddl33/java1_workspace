package day05;

import java.util.Scanner;

public class DoWhileTest {
	public static void main(String[] args) {
		int choice = 0;
		do 
		{
			System.out.println("1.��ſ����ȸ\n2.�нǽŰ�\n3.��������\n0.��������");
			choice = new Scanner(System.in).nextInt();
			
			switch(choice)
			{
			case 1:
				System.out.println("������� 10000���Դϴ�.");
				break;

			case 2:
				System.out.println("�ȉ�׿�.");
				break;

			case 3:
				System.out.println("���� ������ ����� �ƴմϴ�.");
				break;
			default :
				System.out.println(choice == 0? "������ �����ϴ� ���Դϴ�." : "�߸� �����̽��ϴ�.");
			
			}
		}
		while(choice != 0);
	}

}
