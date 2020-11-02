package day04;

public class If4 {
	public static void order(int age) {
		if(age>=18)
		{
			System.out.println("주문이 완료되었습니다.");
		}
	}
	public static void main(String[] args) {
		int age = 18;
		order(age);
	}

}
