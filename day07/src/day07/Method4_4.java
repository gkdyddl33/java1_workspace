package day07;

public class Method4_4 {
	public static void main(String[] args) {
		double gasoline = 8.86;
		double distance = 182.736;
		double efficiency = calceffiency(gasoline,distance);
		System.out.printf("¿¬ºñ:%.2fkm\n",efficiency);
	}
	public static double calceffiency(double fuel,double distance)
	{
		return distance / fuel;
	}

}
