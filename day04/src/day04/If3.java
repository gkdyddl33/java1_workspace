package day04;

import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

import javax.swing.JOptionPane;

public class If3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String qMsg = "Q.당신의 혈액형은?";
		String choiceMsg = "1.A\n2.B\n3.O\n4.AB";
		int choice = 0;

		String a_msg = "꼼꼼하고 섬세하다.";
		String b_msg = "추진력이 좋고 화끈하다.";
		String o_msg = "사교성이 좋다.";
		String ab_msg = "착하다.";

		String result = "";
		String errMsg = "다시 시도해주세요";

		System.out.println(qMsg + "\n" + choiceMsg);
		choice = sc.nextInt();

		switch (choice) {
		case 1:
			result = a_msg;
			break;

		case 2:
			result = b_msg;
			break;

		case 3:
			result = o_msg;
			break;

		case 4:
			result = ab_msg;
			break;
		default:
			result = errMsg;
		}
		JOptionPane.showMessageDialog(null, result);
		
	}

}
