package day07;

public class Method4 {
	public static void main(String[] args) {
		// Į�θ� �Ҹ���?
		double kcal = calculatewalkingkcal(5000);
		System.out.println("�Ҹ� Į�θ�:"+kcal+"kcal");
	}
	public static double calculatewalkingkcal(int walkingCount)
	{
		return walkingCount * 0.02;
	}

}
