package day08;

import java.util.Scanner;

public class LoginMethod2 {
	public static void main(String[] args) {
		Login();
	}
	
	public static void Login()
	{
		Scanner sc = new Scanner(System.in);
		
		String inputId, inputPw;
		
		String userId = "test";
		String userPw = "1234";
		
		System.out.print("ID:");
		inputId = sc.next();
		
		System.out.print("PW:");
		inputPw = sc.next();
		
		if(!inputId.equals(userId))
		{
			System.out.println("���̵� �������� �ʽ��ϴ�.");
		}
		else if(!inputPw.equals(userPw))
		{
			System.out.println("��й�ȣ�� Ʋ���ϴ�.");
		}
		else
		{
			System.out.println("�α����� �Ǿ����ϴ�.");
		}
	}

}
