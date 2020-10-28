import java.util.Scanner;

public class InputTask {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1=0;
		int num2=0;
		int result=0;
		
		String n1Msg = "첫번째 정수:";
		String n2Msg = "두번째 정수:";
		String resultMsg = "";
		
		System.out.println(n1Msg);
		num1 = Integer.parseInt(sc.next());
		
		System.out.println(n2Msg);
		num2 = Integer.parseInt(sc.next());
		
		result = num1+num2;
		System.out.printf("%d+%d=%d\n",num1,num2,result);
	}

}
