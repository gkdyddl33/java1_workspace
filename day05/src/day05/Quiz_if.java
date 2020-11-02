package day05;

import javax.swing.JOptionPane;

public class Quiz_if {
	public static void main(String[] args) {
		String qMsg = "Q.다음 중 동물이 아닌것은?";
		String choiceMsg = "1.돼지\n2.염소\n3.우산\n4.고양이";
		String result ="";
		
		while(!result.equals("정답"))
			// 문자열이랑 비교를 할 때 메소드를 사용  equals : 답 비교
		{
			int choice = Integer.parseInt(JOptionPane.showInputDialog(qMsg+"\n"+choiceMsg));
			int answer = 3;
			
			if(choice==answer)
			{
				result = "정답";
			}
			else if(choice < 1 || choice >4)
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

}
