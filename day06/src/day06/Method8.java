package day06;

public class Method8 {
	public static void main(String[] args) {
		// �ڵ����� �����?
		
		// ���ָ� ��뷮
		double gasoline = 8.86;
		// ���ָ��� �� ����Ͽ� �̵��� �Ÿ�
		double distance = 182.736;
		//���� ���
		double efficiency = calceffiency(gasoline,distance);
		System.out.printf("����:%.2f km/L",efficiency);
	}
	public static double calceffiency(double fuel,double distance)
	{
		// ���� = �̵��Ÿ� / ��뷮
		return distance / fuel;
	}

}
