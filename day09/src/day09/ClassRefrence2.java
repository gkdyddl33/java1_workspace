package day09;

public class ClassRefrence2 {
	public static void main(String[] args) {
		Student a = new Student("Tom");
		System.out.println(a.count);
		
		Student b = new Student("John");
		System.out.println(b.count);
		
		Student c = new Student("Kate");
		System.out.println(c.count);
	}
}
class Student{
	static int count = 0;
	String name;
	
	Student(String name)
	{
		count++;
		this.name = name;
	}
}