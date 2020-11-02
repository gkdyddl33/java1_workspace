package day05;

public class Array5 {
	public static void main(String[] args) {
		int[] values = new int[5];
		
		for(int i=0;i<values.length;i++)
		{
			values[i] = i*i;
		}
		for(int i=0;i<values.length;i++)
		{
			System.out.println(values[i]);
		}
	}

}
