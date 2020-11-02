package day10;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("바나나:1, 복숭아:2 ?");
		int input = sc.nextInt();
		Polymorphism pol;
		
		if(input == 1)
		{
			pol = new Banana();
			pol.show();
		}
		else if(input == 2)
		{
			pol = new Peach();
			pol.show();
		}
		
		//Polymorphism pol = new Peach(); // new Banana()
		//pol.show();
		
		// 예를 들면, 게임을 예로 들수있다.
		// 부모클래스로 게임 왕을 자식클래스로 전사 궁수 등등 직업을
		// 설정할 수 있다.
		
}

}
