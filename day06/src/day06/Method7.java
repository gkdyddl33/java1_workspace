package day06;

public class Method7 {
	
	public static void main(String[] args) {
		// Į�θ� �Ҹ���?
		double kcal = calculateWalkingkcal(5000);
		System.out.println("�Ҹ� Į�θ�:"+kcal+"kcal");

	}
	public static double calculateWalkingkcal(int walkingCount)
	{
		return walkingCount * 0.02;
	}
}
