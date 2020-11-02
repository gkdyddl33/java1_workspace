package day03;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class DialogTest {
	public static void main(String[] args) {
		// 대화상자
		//JOptionPane.showMessageDialog(null,
				//JOptionPane.showInputDialog("이름을 입력하세요"));
		
		// 두 정수 입력받고 출력하기
		Scanner sc = new Scanner(System.in);
		
		int num1=0;
		int num2=0;
		int result=0;
		// 출력할 메세지도 문자열 값이기 때문에 각 Msg 변수에 담아준다.
		// 추후 메세지 내용이 변경되어도 여기에서만 변경하면 사용한 모든 곳이 변경된다.
		String n1Msg="첫번째 정수:";
		String n2Msg="두번째 정수:";
		String resultMsg="";
		
		// 입력받은 문자열 값을 정수로 형 변환하고, int형 변수인 num1에 담는다.
		num1 = Integer.parseInt(JOptionPane.showInputDialog(n1Msg));
		num2 = Integer.parseInt(JOptionPane.showInputDialog(n2Msg));
		
		result = num1 +num2;
		resultMsg = num1+"+"+num2+"="+result;
		
		JOptionPane.showMessageDialog(null, resultMsg);
				
		
	}

}
