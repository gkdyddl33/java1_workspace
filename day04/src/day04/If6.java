package day04;

public class If6 {
	public static String getRole(int age)
	{
		String role = "";
		if(age>18)
		{
			role="����";
		}
		else if(age>13)
		{
			role="û�ҳ�";
		}
		else if(age>6)
		{
			role="���";
		}
		else
		{
			role="����";
		}
		return role;
	}
	public static void main(String[] args) {
		int age = 20;
		String role = getRole(age);
		System.out.println(role);
	}

}
