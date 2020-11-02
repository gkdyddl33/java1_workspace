package day05;

public class Array7 {
	public static void main(String[] args) {
		int[] users = {257,281,234,232,187,99,116};
		System.out.printf("하루평균 접속자:%d\n",average(users));
	}
	public static int average(int[] arr)
	{
		int sum = 0;
		for(int i=0;i<arr.length;i++)
		{
			sum += arr[i];
		}
		return sum/arr.length;
	}

}
