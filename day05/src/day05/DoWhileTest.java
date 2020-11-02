package day05;

import java.util.Scanner;

public class DoWhileTest {
	public static void main(String[] args) {
		int choice = 0;
		do 
		{
			System.out.println("1.통신요금조회\n2.분실신고\n3.할인혜택\n0.상담원연결");
			choice = new Scanner(System.in).nextInt();
			
			switch(choice)
			{
			case 1:
				System.out.println("현재까지 10000원입니다.");
				break;

			case 2:
				System.out.println("안됬네요.");
				break;

			case 3:
				System.out.println("할인 가능한 등급이 아닙니다.");
				break;
			default :
				System.out.println(choice == 0? "상담원을 연결하는 중입니다." : "잘못 누르셨습니다.");
			
			}
		}
		while(choice != 0);
	}

}
