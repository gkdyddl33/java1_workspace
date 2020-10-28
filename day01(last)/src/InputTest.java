import java.util.Scanner;

public class InputTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름:");
		String name = "";
		name = sc.next();
		System.out.println(name+"님 환영합니다.");
		
		System.out.print("나이:");
		int age = 0;
		age = sc.nextInt();
		System.out.println(age+"살");
		
		System.out.println(10&11);
		System.out.println(10|11);
		System.out.println(10^11);
		
		System.out.println(~10);
	}
}
