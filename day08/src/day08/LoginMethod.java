package day08;

import java.util.Scanner;

public class LoginMethod {
	public static void main(String[] args) {
		Login();
	}
	public static void Login()
	{
		Scanner sc = new Scanner(System.in);
		
		String inputId,inputPw;
		
		String userId = "test";
		String userPw = "1234";
		
		System.out.print("ID:");
		inputId = sc.next();
		
		System.out.print("PW:");
		inputPw = sc.next();
		
		if(!inputId.equals(userId))
		{
			System.out.println("아이디가 존재하지 않습니다.");
		}
		else if(!inputPw.equals(userPw))
		{
			System.out.println("비밀번호가 틀립니다.");
		}
		else
		{
			System.out.println("로그인 되었습니다.");
		}
	}
}
