package day09;

public class Student extends Person{
	
	private String studentID;
	private int grade;
	private double GPA;
	public String getStudentID() {
		return studentID;
	}
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public double getCPA() {
		return GPA;
	}
	public void setGPA(double gPA) {
		GPA = gPA;
	}
	
	// ��ӹ��� Ŭ������ �����ؼ� ���.
	public Student(String name, int age, int height, int weight, String studentID, int grade, double gPA) {
		super(name, age, height, weight);
		this.studentID = studentID;
		this.grade = grade;
		GPA = gPA;
	}
	
	
	public void show()
	{
		System.out.println("--------------------");
		System.out.println("�л� �̸�:"+getName());
		System.out.println("�л� ����:"+getAge());
		System.out.println("�л� Ű:"+getHeight());
		System.out.println("�л� ������:"+getWeight());
		System.out.println("�й�:"+getStudentID());
		System.out.println("�г�:"+getGrade());
		System.out.println("����:"+getCPA());
	}

}