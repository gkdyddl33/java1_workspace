package day04;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Quiz {
	public static void main(String[] args) {
		// Q. ���� �� ������ �ƴ� ����?
		// 1.���� 2.���� 3.��� 4.�����
		// �����̸� "����" ���, �����̸� "����" ���
		
		Scanner sc = new Scanner(System.in);
		
		String qMsg = "Q.���� �� ������ �ƴѰ���?";
		String choiceMsg = "1.����\n2.����\n3.���\n4.�����";
		
		int choice = 0;
		int answer = 3;
		String result = "";
		
		System.out.println(qMsg);
		System.out.println(choiceMsg);
		choice = sc.nextInt();
		
		result = choice == answer ? "����" : "����";
		System.out.println(result);
		
		
	}

}
