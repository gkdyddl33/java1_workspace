package day04;

public class While {
	public static void main(String[] args) {
		// �Է�
		int count=Integer.parseInt(args[0]);
		// ���
		System.out.println("ī��Ʈ �ٿ��� �����մϴ�.");
		// �ݺ���
		while(count>=0)
		{// ���ѷ��� : �ݺ����� Ż������ ���ϴ� ��Ȳ
			System.out.println(count);
			count--; // 5->4->3...->0
		}
		System.out.println("�߻�!");
	}

}
