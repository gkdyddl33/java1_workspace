package Finalproject;

import java.util.Scanner;

public class LoginJoinMain3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		UserManager um = new UserManager();
		int choice;
		
		while(true)
		{
			System.out.println("�١�Login OR Join�١�");
			System.out.println("1.�α���");
			System.out.println("2.ȸ������");
			System.out.println("3.ȸ����ü���");
			System.out.println("4.������");
			
			System.out.println("�Է�:");
			choice = sc.nextInt();
			
			if(choice == 1) {um.login();}
			else if(choice == 2) {um.join();}
			else if(choice == 3) {um.print();}
			else if(choice == 4) {
				System.out.println("���α׷� ����");
				break;
			}
			else
			{
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
		}
	}

}