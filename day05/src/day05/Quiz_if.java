package day05;

import javax.swing.JOptionPane;

public class Quiz_if {
	public static void main(String[] args) {
		String qMsg = "Q.���� �� ������ �ƴѰ���?";
		String choiceMsg = "1.����\n2.����\n3.���\n4.�����";
		String result ="";
		
		while(!result.equals("����"))
			// ���ڿ��̶� �񱳸� �� �� �޼ҵ带 ���  equals : �� ��
		{
			int choice = Integer.parseInt(JOptionPane.showInputDialog(qMsg+"\n"+choiceMsg));
			int answer = 3;
			
			if(choice==answer)
			{
				result = "����";
			}
			else if(choice < 1 || choice >4)
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

}
