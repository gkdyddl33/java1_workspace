import javax.swing.JOptionPane;

public class Quiz {
	public static void main(String[] args) {
		String qMsg = "Q.���� �� ������ �ƴѰ���?";
		String choiceMsg = "1.����\n2.����\n3.���\n4.�����";
		
		int choice = Integer.parseInt(JOptionPane.showInputDialog(qMsg+"\n"+choiceMsg));
		int answer = 3;
		
		String result = choice == answer? "����" :
			choice >=1 && choice <=4 ? "����" : "?";
			JOptionPane.showMessageDialog(null, result);
	}
}
