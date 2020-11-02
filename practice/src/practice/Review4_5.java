package practice;

public class Review4_5 {
	public static void main(String[] args) {
		int N =50;
		int[][] arData = new int[N][N];
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				arData[i][j]=(int)(Math.random()*10);
			}
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(arData[i][j]+"");
			}
			System.out.println();
		}
	}

}
