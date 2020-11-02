package day06;

public class Method8 {
	public static void main(String[] args) {
		// 자동차의 연비는?
		
		// 가솔린 사용량
		double gasoline = 8.86;
		// 가솔린을 다 사용하여 이동한 거리
		double distance = 182.736;
		//연비 계산
		double efficiency = calceffiency(gasoline,distance);
		System.out.printf("연비:%.2f km/L",efficiency);
	}
	public static double calceffiency(double fuel,double distance)
	{
		// 연비 = 이동거리 / 사용량
		return distance / fuel;
	}

}
