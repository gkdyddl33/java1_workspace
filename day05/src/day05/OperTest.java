package day05;

public class OperTest {
	public static void main(String[] args) {
		for(int i=0;i<10;i++)
		{
			System.out.println(i+1);
			if(i==3)
			{
				break;
			}
		}
		
		for(int i=0;i<10;i++)
		{
			if(i==3)
			{
				continue;
			}
			System.out.println(i+1);
		}
		
		
	}

}
