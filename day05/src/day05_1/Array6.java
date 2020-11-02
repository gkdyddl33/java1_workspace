package day05_1;

public class Array6 {
	public static void main(String[] args) {
		int[] arr = new int[100];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*100+1);
		}
		
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("100까지의 랜덤 정수의 평균 값은"+sum/100+"입니다.");
	}

}
