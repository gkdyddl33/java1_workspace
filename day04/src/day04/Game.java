package day04;

public class Game {
	public static void main(String[] args) {
		int sum=0;
		System.out.println("����:");
		for(int i=0;i<=10;i++)
		{
			if(i==3||i==6||i==9)
			{
				continue;
			}
			System.out.println(i+" ");
			sum += i;
		}
		System.out.printf("\n�� ��: %d\n",sum);
	}

}
