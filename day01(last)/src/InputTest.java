import java.util.Scanner;

public class InputTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸�:");
		String name = "";
		name = sc.next();
		System.out.println(name+"�� ȯ���մϴ�.");
		
		System.out.print("����:");
		int age = 0;
		age = sc.nextInt();
		System.out.println(age+"��");
		
		System.out.println(10&11);
		System.out.println(10|11);
		System.out.println(10^11);
		
		System.out.println(~10);
	}
}
