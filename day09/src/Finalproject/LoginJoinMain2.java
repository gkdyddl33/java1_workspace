package Finalproject;

import java.util.Scanner;
// View : �����UI
public class LoginJoinMain2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		UserManager2 um2 = new UserManager2();
		int choice;
		
		while(true)
		{
			System.out.println("�١ڡ� Login OR Join �١ڡ�");
			System.out.println("1. �α���");
			System.out.println("2. ȸ������");
			System.out.println("3. ȸ����ü���");
			System.out.println("4. ������");
			System.out.println("�١ڡ١١ڡ١١ڡ١١ڡ١١ڡ١١ڡ�");
			
			System.out.print("�Է�:");
			choice=sc.nextInt();
			
			if(choice == 1) {um2.login();}
			else if(choice == 2) {um2.join();}
			else if(choice == 3) {um2.print();}
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