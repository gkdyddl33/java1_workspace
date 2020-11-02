package day03;

import java.util.Scanner;

public class InputTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		System.out.print("나이:");
		int age = 0;
		age = sc.nextInt();
		System.out.println(age + "살");

		String name ="";
		System.out.print("이름:");
		name = sc.next();
		System.out.println(name + "님 환영합니다.");
		//System.out.println(name + sc.next() + "님 환영합니다."); // 공백의 값을 next로 받으면 됨 . 띄워쓰기를 할 경우 -> 강 하영
		// sc.nectLine(); -> enter 처리를 해주고 작업해야 다음으로 잘 넘어가짐. 엔터 상쇄
		//name = sc.nextLine();
		
		
	}

}
