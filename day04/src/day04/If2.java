package day04;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class If2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String qMsg = "Q.���� �� ������ �ƴѰ���?";
		String choiceMsg = "1.����\n2.����\n3.���\n4.�����\n";
		
		int choice = Integer.parseInt(JOptionPane.showInputDialog(qMsg)+"\n"+JOptionPane.showInputDialog(choiceMsg));
		choice = sc.nextInt();
		int answer = 3;
		
		String result = "";
		
		if(choice==answer)
		{
			result = "����";
		}
		else if(choice < 1 && choice > 4)
		{
			result = "�߸� �Է��ϼ̽��ϴ�.";
		}
		else
		{
			result = "����";
		}
		JOptionPane.showMessageDialog(null, result);
	}

}
