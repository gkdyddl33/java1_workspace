package Finalproject;

// Model : 저장클래스 = 변수설정, 출력메소드 생성
public class User {
	static String hpage = "www.naver.com";
	String id;
	String pw;
	String name;
	public void info()
	{
		System.out.println("hpage:"+hpage);
		System.out.println("id:"+id);
		System.out.println("pw:"+pw);
		System.out.println("name:"+name);
	}

}
