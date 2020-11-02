package practice;

public class Review4_2 {
	public static int topIndex(int[] scores)
	{
		int topIdx=0;
		for (int i = 0; i < scores.length; i++) {
			if(scores[topIdx]<scores[i])
			{
				topIdx=i;
			}
		}
		return topIdx;
	}
	
	public static void main(String[] args) {
		String[] names = {"Elena","Suzie","John","Emily","Neda","Alex","Daniel","Hamilto"};
		int[] scores = {65,74,23,75,68,96,88,98,54};
				
		int i = topIndex(scores);
		System.out.printf("1µî:%s(%d)\n",names[i],scores[i]);
	}

}
