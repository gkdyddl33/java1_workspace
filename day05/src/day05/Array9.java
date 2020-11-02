package day05;

import java.util.Arrays;

public class Array9 {
	public static void main(String[] args) {
		int[] values = new int[10];
		for(int i=0;i<values.length;i++)
		{
			values[i] = (int)Math.pow(2, i);
		}
		System.out.println(Arrays.toString(values));
	}

}
