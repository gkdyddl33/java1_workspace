package day06;

public class Method7 {
	
	public static void main(String[] args) {
		// 칼로리 소모량은?
		double kcal = calculateWalkingkcal(5000);
		System.out.println("소모 칼로리:"+kcal+"kcal");

	}
	public static double calculateWalkingkcal(int walkingCount)
	{
		return walkingCount * 0.02;
	}
}
