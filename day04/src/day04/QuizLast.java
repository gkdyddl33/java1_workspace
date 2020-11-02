package day04;

import javax.swing.JOptionPane;

public class QuizLast {
	public static void main(String[] args) {
		String qMsg = "Q.다음 중 동물이 아닌것은?";
		String choiceMsg = "1.돼지\n2.염소\n3.우산\n4.고양이";
		int choice = Integer.parseInt(JOptionPane.showInputDialog(qMsg)+"\n"+JOptionPane.showInputDialog(choiceMsg));
		int answer =3;
		
		String result = choice == answer ? "정답" :
			choice >= 1 && choice <=4 ? "오답" : "?";
			
			JOptionPane.showMessageDialog(null, result);
	}

}
