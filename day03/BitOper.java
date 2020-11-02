package day03;

public class BitOper {
	public static void main(String[] args) {
		// 논리 연산자
		System.out.println(10&11);  // 논리 곱
		System.out.println(10|11);   // 논리 덧셈
		System.out.println(10^11);   // 베타 논리 합 - 두 숫자가 다를 때 "1" , 같으면 "0"
		
		// 단항 연산자
		System.out.println(~10);  // 0 -> 1 , 1 -> 0 
		// ** ~a = -a-1 
	}

}
