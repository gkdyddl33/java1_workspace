package day06;

public class ClassRefrence {
	public static void main(String[] args) {
		// ��ü �л� ����?
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
	// �� �л��� ���
	// static �� Ŭ���� ���� : ��ü �ܺ��� ���������� ����
	static int count = 0; // ��ü �ȿ��� �ƴ϶� �ۿ��� �����ϰ� ����. -> 1 2 3
	
	// �Ϲ��� Ŭ���� : �ν��Ͻ� ���� : ��ü������ ����
	String name;
	
	Student(String name)
	{
		count++; //  1���� ����
		this.name = name;
	}
}
