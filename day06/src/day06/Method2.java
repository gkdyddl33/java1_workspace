package day06;

public class Method2 {
	// int x �Ķ���͸� ������ ����.
	public static void printSquare(int x)
	{
		System.out.println(x * x);
	}
	
	// ���α׷��� ������
	public static void main(String[] args) {
		// ���� �Ķ����
		int value = 2;
		printSquare(value); // �޼ҵ�() ȣ��
		printSquare(3);
		printSquare(value * 2);
		
	}

}
