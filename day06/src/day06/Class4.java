package day06;

public class Class4 {
	public static void main(String[] args) {
	// �� ȣ��
		HoBang h1 = new HoBang();
		h1.contents = "��";
		h1.price = 600;
		System.out.println(h1.info());
		
	// ��äȣ��
		HoBang h2 = new HoBang();
		h2.contents = "��ä";
		h2.price = 700;
		System.out.println(h2.info());
		
	// ����ȣ��
		HoBang h3 = new HoBang();
		h3.contents = "����";
		h3.price = 900;
		System.out.println(h3.info());
	}

}
class HoBang{
	String contents;
	int price;
	
	String info()
	{
		return String.format("%s ȣ��:%d��", contents, price);
	}
}