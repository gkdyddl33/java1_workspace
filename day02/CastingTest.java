package day02;

public class CastingTest {
	public static void main(String[] args) {
		// 자동 형변환
		System.out.println(10/3); // 정수에 정수를 사용하므로 정수 "3" 이 나옴
		System.out.println((10+0.0) / 3); 
		System.out.println("--------------------");
		
		// 강제 형변환
		System.out.println((int)1.25+3.02); // 최 단 산 -> 단항연산자 int 가 우선 -> 1.25가 1로 바뀜
		System.out.println((int)(1.25+3.92)); // 최 -> 최우선연산에서 괄호가 있음 괄호 우선
		// 1.25 + 3.95 = 4
		System.out.println((int)1.25+(int)3.95); // 강제 형 변환 int 추가
	}

}
