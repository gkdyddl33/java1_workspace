package day07;

public class Method4 {
	public static void main(String[] args) {
		// 칼로리 소모량은?
		double kcal = calculatewalkingkcal(5000);
		System.out.println("소모 칼로리:"+kcal+"kcal");
	}
	public static double calculatewalkingkcal(int walkingCount)
	{
		return walkingCount * 0.02;
	}

}
