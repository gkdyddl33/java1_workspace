package day05;

public class OperTask2 {
	public static void main(String[] args) {
		for (int i = 0; i < 6; i++) {
			if(i==1)
			{
				continue;
			}
			System.out.println((char)(i+65));
		}
		
		for (int i = 0; i < 100; i++) {
			System.out.println(100-i);
			if(i==30)
			{
				break;
			}
		}
		
		for (int i = 0; i < 100; i++) {
			if((i+1)%3!=0 || (i+1)%5!=0)
			{
				continue;
			}
			System.out.println(i+1);
		}
	}

}
