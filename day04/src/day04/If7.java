package day04;

public class If7 {
	public static double calculateBMI(double weight,double tall)
	{
		return weight / (tall*tall);
	}
	public static void printBMIclassfication(double bmi)
	{
		if(bmi>30)
		{
			System.out.println("비만입니다.");
		}
		else if(bmi>=25)
		{
			System.out.println("과체중입니다.");
		}
		else if(bmi>=18.5)
		{
			System.out.println("정상입니다.");
		}
		else
		{
			System.out.println("저체중입니다.");
		}
		System.out.printf("BMI: %.2f\n",bmi);
	}
	public static void main(String[] args) {
		double weight = 49.8;
		double tall = 154.5;
		double bmi = calculateBMI(weight,tall);
		printBMIclassfication(bmi);
	}

}
