package day08;

public class MethodReview5 {
	public static void main(String[] args) {
		double kcal = calculatewalkingkcal(5000);
		System.out.println("�Ҹ� Į�θ�:"+kcal+"kcal");
	}
	public static double calculatewalkingkcal(int walkingcount)
	{
		return walkingcount * 0.02;
	}

}
