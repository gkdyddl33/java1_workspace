package Finalproject;

import java.util.Scanner;

// Controller : 제어자
public class UserManager2 {
	Scanner sc = new Scanner(System.in);
	
	User users[] = new User[10];
	int count = 0;
	
	public void login()
	{
		System.out.println("---Login---");
		
		System.out.print("ID:");
		String inputId = sc.next();
		
		System.out.print("PW:");
		String inputPw = sc.next();
		
		for (int i = 0; i < count; i++) 
		{
			if(users[i].id.equals(inputId) && users[i].pw.equals(inputPw))
			{
				System.out.println("로그인 성공!");
				return;
			}
		}
		System.out.println("로그인 실패!");
	}
	
	public void join()
	{
		User newUser = new User();
		
		System.out.println("---Join---");
		
		System.out.print("ID:");
		newUser.id = sc.next();
		
		System.out.print("PW:");
		newUser.pw = sc.next();
		
		System.out.print("NAME:");
		newUser.name = sc.next();
		
		users[count] = newUser;
		count++;
	}
	public void print()
	{
		for (int i = 0; i < count; i++) 
		{
			System.out.println(i+1+"번째 사용자 정보---");
			users[i].info();
		}
	}
}
