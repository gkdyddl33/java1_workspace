package day05;

public class Array1 {
	public static void main(String[] args) {
		// ����� ������?
		double[] grades = {3.45,2.82,3.85,3.94};
		
		grades[1] = 7.2;
		grades[3] = grades[1] + 3.3;
		
		System.out.printf("1�г�:%.2f\n",grades[0]);
		System.out.printf("2�г�:%.2f\n",grades[1]);
		System.out.printf("3�г�:%.2f\n",grades[2]);
		System.out.printf("4�г�:%.2f\n",grades[3]);
	}

}
