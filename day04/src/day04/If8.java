package day04;

public class If8 {
	public static void printPay(double basepay,int hours)
	{
		//최저시급
		if(basepay < 8.00)
		{
			System.out.println("error : 최저시급 불이행.");
			return;
		}
		//초과근무 제한시간
		if(hours > 60)
		{
			System.out.println("error : 초과근무시간을 넘었습니다.");
			return;
		}
		double pay = 0;
		if(hours > 40)
		{
			int extraHours = hours - 40;
			hours -= extraHours;
			double extraPay = basepay * extraHours *1.5;
			pay += extraPay;
		}
		pay += basepay * hours;
		System.out.printf("$%.2f\n",pay);
	}
	public static void main(String[] args) {
		printPay(10.00,40);
		printPay(10.00,50);
		printPay(7.50,38);
		printPay(8.50,66);
	}

}
