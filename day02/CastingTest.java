package day02;

public class CastingTest {
	public static void main(String[] args) {
		// �ڵ� ����ȯ
		System.out.println(10/3); // ������ ������ ����ϹǷ� ���� "3" �� ����
		System.out.println((10+0.0) / 3); 
		System.out.println("--------------------");
		
		// ���� ����ȯ
		System.out.println((int)1.25+3.02); // �� �� �� -> ���׿����� int �� �켱 -> 1.25�� 1�� �ٲ�
		System.out.println((int)(1.25+3.92)); // �� -> �ֿ켱���꿡�� ��ȣ�� ���� ��ȣ �켱
		// 1.25 + 3.95 = 4
		System.out.println((int)1.25+(int)3.95); // ���� �� ��ȯ int �߰�
	}

}
