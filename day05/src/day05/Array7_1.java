package day05;

public class Array7_1 {
	public static void main(String[] args) {
		for(int i = 2;i<9;i++)
		{
			System.out.println(i+"´Ü");
			for(int j=1;j<10;j++)
			{
				System.out.printf("\t%d x %d = %d\n",i,j,i*j);
			}
		}
	}

}
