package day05;

import java.util.Arrays;

public class Array10 {
	public static void main(String[] args) {
		int[] values = new int[10];
		for(int i=0;i<values.length;i++)
		{
			values[i]=(int)Math.pow(i, 2);
		}
		System.out.println(Arrays.toString(values));
	}

}
