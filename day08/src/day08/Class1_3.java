package day08;

public class Class1_3 {
	public static void main(String[] args) {
		Hobang h1 = new Hobang();
		h1.contents="��";
		h1.price=600;
		System.out.println(h1.info());
		
		Hobang h2 = new Hobang();
		h2.contents="��ä";
		h2.price=700;
		System.out.println(h2.info());
		
		Hobang h3 = new Hobang();
		h3.contents="����";
		h3.price=900;
		System.out.println(h3.info());
	}
}
class Hobang{
	String contents;
	int price;
	
	String info()
	{
		return String.format("%s ȣ��: %d��",contents,price);
	}
}
