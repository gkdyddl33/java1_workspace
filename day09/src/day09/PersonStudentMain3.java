package day09;

import java.util.Scanner;

public class PersonStudentMain3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�� ����� �л��� �����մϱ�?");
		
		int number = sc.nextInt();
		Student[] students = new Student[number];
		for(int i=0;i<number;i++)
		{
			String name;
			int age;
			int height;
			int weight;
			String studentID;
			int grade;
			double gPA; 
			System.out.print("�л��� �̸��� �Է��ϼ���:");
			name = sc.next();
			
			System.out.print("�л��� ������ �Է��ϼ���:");
			age = sc.nextInt();
			
			System.out.print("�л��� Ű�� �Է��ϼ���:");
			height = sc.nextInt();
			
			System.out.print("�л��� �����Ը� �Է��ϼ���:");
			weight = sc.nextInt();
			
			System.out.print("�л��� �й��� �Է��ϼ���:");
			studentID = sc.next();
			
			System.out.print("�л��� �г��� �Է��ϼ���:");
			grade = sc.nextInt();
			
			System.out.print("�л��� ������ �Է��ϼ���:");
			gPA = sc.nextDouble();
			
			students[i]= new Student(name,age,height,weight,studentID,grade,gPA);
		}
		for (int i = 0; i < number; i++)
		{
			students[i].show();			
		}
	}

}
