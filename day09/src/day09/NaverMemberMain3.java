package day09;

import java.util.Scanner;

public class NaverMemberMain3 {
	public static void main(String[] args) {
		User users[] = new User[4];
		
		/*
		User user1 = new User("kim123","k123","김길동");
		User user2 = new User("park123","p123","박길동");
		User user3 = new User("song123","s123","송길동");
		User user4 = new User("lee123","l123","이길동");
		
		User.hpage = "www.google.com";
		
		user1.info();
		user2.info();
		user3.info();
		user4.info();
		*/
		
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < users.length; i++) {
			//users[i] = new User();
			System.out.println("---"+i+1+"번째 사용자입력---");
			System.out.println("ID:");
			users[i].setId(sc.next());
			
			System.out.println("PW:");
			users[i].setPw(sc.next());
			
			System.out.println("NAME:");
			users[i].setName(sc.next());
		}
		for (int i = 0; i < users.length; i++) {
			users[i].info();
		}
	}
}

class User{
	static String hpage = "www.naver.com";
	String id;
	String pw;
	String name;

	//디폴트생성
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
		System.out.println("id:"+id);
		System.out.println("pw:"+pw);
		System.out.println("name:"+name);
	}
}
