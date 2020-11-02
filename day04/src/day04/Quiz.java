package day04;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Quiz {
	public static void main(String[] args) {
		// Q. 다음 중 동물이 아닌 것은?
		// 1.돼지 2.염소 3.우산 4.고양이
		// 정답이면 "정답" 출력, 오답이면 "오답" 출력
		
		Scanner sc = new Scanner(System.in);
		
		String qMsg = "Q.다음 중 동물이 아닌것은?";
		String choiceMsg = "1.돼지\n2.염소\n3.우산\n4.고양이";
		
		int choice = 0;
		int answer = 3;
		String result = "";
		
		System.out.println(qMsg);
		System.out.println(choiceMsg);
		choice = sc.nextInt();
		
		result = choice == answer ? "정답" : "오답";
		System.out.println(result);
		
		
	}

}
