package day04;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class If2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String qMsg = "Q.다음 중 동물이 아닌것은?";
		String choiceMsg = "1.돼지\n2.염소\n3.우산\n4.고양이\n";
		
		int choice = Integer.parseInt(JOptionPane.showInputDialog(qMsg)+"\n"+JOptionPane.showInputDialog(choiceMsg));
		choice = sc.nextInt();
		int answer = 3;
		
		String result = "";
		
		if(choice==answer)
		{
			result = "정답";
		}
		else if(choice < 1 && choice > 4)
		{
			result = "잘못 입력하셨습니다.";
		}
		else
		{
			result = "오답";
		}
		JOptionPane.showMessageDialog(null, result);
	}

}
