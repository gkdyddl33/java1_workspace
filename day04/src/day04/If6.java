package day04;

public class If6 {
	public static String getRole(int age)
	{
		String role = "";
		if(age>18)
		{
			role="성인";
		}
		else if(age>13)
		{
			role="청소년";
		}
		else if(age>6)
		{
			role="어린이";
		}
		else
		{
			role="유아";
		}
		return role;
	}
	public static void main(String[] args) {
		int age = 20;
		String role = getRole(age);
		System.out.println(role);
	}

}
