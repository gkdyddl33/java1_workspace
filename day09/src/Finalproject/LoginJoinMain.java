package Finalproject;

import java.util.Scanner;

// View : 사용자 UI : 입력 코드 작성 : UserManager에서 호출하는 부분
public class LoginJoinMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		UserManager um = new UserManager();
		int choice;
		
		while(true)
		{
			System.out.println("☆★ Login OR Join ☆★");
			System.out.println("1.로그인");
			System.out.println("1.회원가입");
			System.out.println("1.회원전체출력");
			System.out.println("1.끝내기");
			
			choice = sc.nextInt();
			
			if(choice==1) {um.login();}
			else if(choice==2) {um.join();}
			else if(choice==3) {um.print();}
			else if(choice==4) {
				System.out.println("프로그램 종료");
				break;
			}
			else
			{
				System.out.println("잘못 입력하셨습니다.");
			}
		}
	}

}
