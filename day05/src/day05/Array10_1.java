package day05;

public class Array10_1 {
	public static void main(String[] args) {
		// 100���� ���������� ����� ���ϴ�
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
		System.out.printf("100������ ���� ������ ��հ���"+sum/100+"�Դϴ�");
	}

}
