package day04;

public class If5 {
	public static void test(int time, int hours) {
		int limitHours = 0;
		if (time <= 18 || limitHours <= 8) {
			System.out.println("good");
		} else {
			System.out.println("bad");
		}
	}

	public static void main(String[] args) {
		int time = 18;
		int hours = 8;
		test(time, hours);
	}

}
