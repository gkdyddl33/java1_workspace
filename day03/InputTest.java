package day03;

import java.util.Scanner;

public class InputTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		System.out.print("����:");
		int age = 0;
		age = sc.nextInt();
		System.out.println(age + "��");

		String name ="";
		System.out.print("�̸�:");
		name = sc.next();
		System.out.println(name + "�� ȯ���մϴ�.");
		//System.out.println(name + sc.next() + "�� ȯ���մϴ�."); // ������ ���� next�� ������ �� . ������⸦ �� ��� -> �� �Ͽ�
		// sc.nectLine(); -> enter ó���� ���ְ� �۾��ؾ� �������� �� �Ѿ��. ���� ���
		//name = sc.nextLine();
		
		
	}

}
