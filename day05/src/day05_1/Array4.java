package day05_1;

public class Array4 {
	public static void main(String[] args) {
		String[] name = {"Elena","Suzie","Emily","Neda","Kate","Alex","Daniel","Hamilto"};
		
		int[] scores = {65,74,23,75,68,96,88,98,54};
		
		int i = topIndex(scores);
		System.out.printf("1µî:%s(%d)\n",name[i],scores[i]);
	}
	
	public static int topIndex(int[] scores)
	{
		int topIndex = 0;
		
		for (int i = 0; i < scores.length; i++) {
			if(scores[topIndex]<scores[i])
			{
				topIndex = i;
			}
		}
		return topIndex;
	}

}
