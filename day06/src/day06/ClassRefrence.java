package day06;

public class ClassRefrence {
	public static void main(String[] args) {
		// 전체 학생 수는?
		Student a = new Student("Tom");
		System.out.println(a.count);
		
		Student b = new Student("John");
		System.out.println(b.count);
		
		Student c = new Student("Kate");
		System.out.println(c.count);
	}

}
class Student
{
	// 총 학생수 출력
	// static 의 클래스 변수 : 객체 외부의 공유가능한 변수
	static int count = 0; // 객체 안에가 아니라 밖에서 공유하게 만듬. -> 1 2 3
	
	// 일반적 클래스 : 인스턴스 변수 : 객체내부의 변수
	String name;
	
	Student(String name)
	{
		count++; //  1부터 시작
		this.name = name;
	}
}
