package practice;

import java.util.Arrays;

public class Review2 {
	public static int sum(int[] numbers)
	{
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=i*i;
		}
		System.out.printf("�迭:%s\n",Arrays.toString(arr));
		System.out.printf("����:%d\n",sum(arr));
	}

}
