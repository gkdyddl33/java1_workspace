package day09;

public class PersonStudentMain2 {
	public static void main(String[] args) {
		//많은 수를 처리할 때는 이렇게 배열로 이용한다
		
		Student[] students = new Student[100];
		
		for(int i =0;i<100;i++)
		{
			students[i] = new Student("홍길동",20,175,70,i+"",1,4.5);
			students[i].show();
		}
		
	}

}
