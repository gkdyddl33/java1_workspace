package day05;

import java.util.concurrent.SynchronousQueue;

public class OperTask {
	public static void main(String[] args) {
		for(int i=0;i<5;i++)
		{
			if(i==1)
			{
				continue;
			}
			System.out.println((char)(i+65));
		}
		
		for(char i='A';i<'F';i++)
		{
			if(i=='B')
			{
				continue;
			}
			System.out.println(i);
		}
		
		for(int i=0;i<100;i++)
		{
			System.out.println(100-i);
			if(i==30)
			{
				break;
			}
		}
		
		for(int i=0;i<100;i++)
		{
			if((i+1)%3 !=0 || (i+1)%5 !=0)
			{
				continue;
			}
			System.out.println(i+1);
		}
	}

}
