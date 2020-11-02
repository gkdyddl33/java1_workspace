package day05;

public class Array10_1 {
	public static void main(String[] args) {
		// 100개의 랜덤정수의 평균을 구하는
		int[] array = new int[100];
		for(int i=0;i<array.length;i++)
		{
			array[i] = (int)(Math.random()*100);
		}
		
		int sum = 0;
		for(int i=0;i<100;i++)
		{
			sum += array[i];
		}
		System.out.printf("100까지의 랜덤 정수의 평균값은"+sum/100+"입니다");
	}

}
