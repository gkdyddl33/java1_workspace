package day09;

public class PersonStudentMain2 {
	public static void main(String[] args) {
		//���� ���� ó���� ���� �̷��� �迭�� �̿��Ѵ�
		
		Student[] students = new Student[100];
		
		for(int i =0;i<100;i++)
		{
			students[i] = new Student("ȫ�浿",20,175,70,i+"",1,4.5);
			students[i].show();
		}
		
	}

}
