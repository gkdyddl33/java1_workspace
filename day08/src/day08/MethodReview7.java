package day08;

public class MethodReview7 {
	public static void main(String[] args) {
		double dollar = dice()+dice()+dice();
		double won = exchange(dollar);
		System.out.printf("ȹ��ݾ�:$%.2f(%.0f��)",dollar,won);
		
	}
	public static int dice()
	{
		return (int)(Math.random()*5)+1;
	}
	public static double exchange(double dollar)
	{
		return dollar * 1082.25108;
	}

}
