package day09;

import java.util.Scanner;

public class NaverMemberMain2 {
	public static void main(String[] args) {
		User user[] = new User[4];
		/*
		User user1 = new User("kim123","k123","��浿");
		User user2 = new User("park123","p123","�ڱ浿");
		User user3 = new User("song123","s123","�۱浿");
		User user4 = new User("lee123","l123","�̱浿");
		
		User.hpage = "www.google.com";
		
		user1.info();
		user2.info();
		user3.info();
		user4.info();
		*/
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < user.length; i++) {
			user[i] = new User();
			
			System.out.println("---"+i+1+"��° ������Է�---");
			System.out.println("ID:");
			user[0].setId(sc.next());
			
			System.out.println("PW:");
			user[0].setPw(sc.next());
			
			System.out.println("NAME:");
			user[0].setName(sc.next());
		}
		for (int i = 0; i < user.length; i++) {
			user[i].info();
		}
	}
}

class User{
	static String hpage = "www.naver.com";
	
	String id;
	String pw;
	String name;
	public User(String id, String pw, String name) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
	}
	public static String getHpage() {
		return hpage;
	}
	public static void setHpage(String hpage) {
		User.hpage = hpage;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void info()
	{
		System.out.println("hpage:"+hpage);
		System.out.println("ID:"+id);
		System.out.println("PW:"+pw);
		System.out.println("NAME:"+name);
	}
}
