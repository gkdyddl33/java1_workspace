import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class Create {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int basepay = 0;
		int hours = 0;
		int result =0;
		
		basepay = sc.nextInt();
		hours = sc.nextInt();
		result = basepay * hours;
		System.out.println(result);
	}

}
