package Finalproject;

import java.util.Scanner;
// View : 사용자UI
public class LoginJoinMain2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		UserManager2 um2 = new UserManager2();
		int choice;
		
		while(true)
		{
			System.out.println("☆★☆ Login OR Join ☆★☆");
			System.out.println("1. 로그인");
			System.out.println("2. 회원가입");
			System.out.println("3. 회원전체출력");
			System.out.println("4. 끝내기");
			System.out.println("☆★☆☆★☆☆★☆☆★☆☆★☆☆★☆");
			
			System.out.print("입력:");
			choice=sc.nextInt();
			
			if(choice == 1) {um2.login();}
			else if(choice == 2) {um2.join();}
			else if(choice == 3) {um2.print();}
			else if(choice == 4) {
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
