package day06;

public class Method9 {

	public static void main(String[] args) {
		// 돈 놓고 돈 먹기
		
		// 획득 달러 계산
		double dollar = dice() + dice() + dice();
		// 달러를 환전
		double won = exchange(dollar);
		System.out.printf("획득 금액:$%.2f(%.0f원)",dollar,won);
	}

	public static int dice() {
		// 1~6사이의 정수를 반환하도록 하시오.
		// math.random() : double 값을 반환 -> 0.00...~0.99..
		// math.random() * 6 -> 0.00..~5.99..~
		// double -> int : (int) 강제 형변환 (math.random()*6) -> 0~5정수
		return (int) (Math.random()*5) + 1; //1~6사이 + 1로
	}

	public static double exchange(double dollar) {
		// 입력받은 달러를 환전하여 반환 하시오.
		return dollar * 1082.25108;
	}
}
