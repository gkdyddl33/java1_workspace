package day06;

public class Method9 {

	public static void main(String[] args) {
		// �� ���� �� �Ա�
		
		// ȹ�� �޷� ���
		double dollar = dice() + dice() + dice();
		// �޷��� ȯ��
		double won = exchange(dollar);
		System.out.printf("ȹ�� �ݾ�:$%.2f(%.0f��)",dollar,won);
	}

	public static int dice() {
		// 1~6������ ������ ��ȯ�ϵ��� �Ͻÿ�.
		// math.random() : double ���� ��ȯ -> 0.00...~0.99..
		// math.random() * 6 -> 0.00..~5.99..~
		// double -> int : (int) ���� ����ȯ (math.random()*6) -> 0~5����
		return (int) (Math.random()*5) + 1; //1~6���� + 1��
	}

	public static double exchange(double dollar) {
		// �Է¹��� �޷��� ȯ���Ͽ� ��ȯ �Ͻÿ�.
		return dollar * 1082.25108;
	}
}
