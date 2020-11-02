package day04;

public class While {
	public static void main(String[] args) {
		// 입력
		int count=Integer.parseInt(args[0]);
		// 출력
		System.out.println("카운트 다운을 시작합니다.");
		// 반복문
		while(count>=0)
		{// 무한루프 : 반복문을 탈출하지 못하는 상황
			System.out.println(count);
			count--; // 5->4->3...->0
		}
		System.out.println("발사!");
	}

}
