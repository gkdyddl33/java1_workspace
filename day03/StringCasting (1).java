package day03;

public class StringCasting {
	public static void main(String[] args) {
		
		String num1 ="1";
		String num2 ="2";
		System.out.println(Integer.parseInt(num1)+Integer.parseInt(num2)); 
		// ���ڿ��� Ŭ���� �̹Ƿ� �Ȱ��� ���������
		// (Ŭ���� �ȿ��� �޼ҵ尡 �����Ƿ� ���������� ��ȯ���ִ� �޼ҵ带 ���)
		
		System.out.println(Double.parseDouble("1.1")+Integer.parseInt("3"));
		
		String name = "���Ͽ�";
		System.out.println("�̸�:"+name);  // ������ ������ �� ���� 
	}

}
