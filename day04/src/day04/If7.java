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
			System.out.println("���Դϴ�.");
		}
		else if(bmi>=25)
		{
			System.out.println("��ü���Դϴ�.");
		}
		else if(bmi>=18.5)
		{
			System.out.println("�����Դϴ�.");
		}
		else
		{
			System.out.println("��ü���Դϴ�.");
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
