package store;

import java.util.Scanner;

public class ArrTask {
	public static void main(String[] args) {
		// 일반 잠실점, 홍대점, 강남점
		String bonusMsg = ""; // 인센티브 매장을 담을 것임
		int bonus = 0;
		
		//대카
		int[][] arrincome = new int[3][2];
		String[] arBranchName = {"잠실점","홍대점","강남정"};
		String[] arAgeName = {"일반점","키즈점"};
		
		//중카 총합과 평균의 배열
		int[] arBranchTotal = new int[3];
		double[] arBranchAvg = new double[2];
		
		int[] arAgeTotal = new int[2];
		double[] arAgeAvg = new double[2];
		
		int total = 0;
		double avg = 0.0;
		
		// 누적연산자로 총길이 구하기
		int length = 0;
		boolean check;
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < arrincome.length; i++) {
			length += arrincome[i].length;
			
			for (int j = 0; j < arrincome[i].length; j++) {
				System.out.println(arBranchName[i]+""+arAgeName[j]+"매출액 입력(단위:만원):");
				arrincome[i][j] = sc.nextInt();
				arBranchTotal[i] += arrincome[i][j];
				arAgeTotal[j] += arrincome[i][j];
				total += arrincome[i][j];
			}
			arBranchAvg[i] = Double.parseDouble(String.format("%.2f", (double)arBranchTotal[i]/arrincome[i].length));
						
		}
		// 총평균,매출
		avg = Double.parseDouble(String.format("%.2f", (double)total/length));
		for (int i = 0; i < arAgeAvg.length; i++) {
			arAgeAvg[i] = Double.parseDouble(String.format("%.2f", (double)arAgeTotal[i]/arrincome.length));
		}
		
		// 인센티브 매장 출력
		bonusMsg = "★인센티브 매장☆\n";
		for (int i = 0; i < arrincome.length; i++) {
			for (int j = 0; j < arrincome[i].length; j++) {
				if(arrincome[i][j]>avg)
				{
					bonusMsg += arBranchName[i]+""+arAgeName[j]+"\n";
					check = true;
				}
			}
		}
		System.out.println(check? bonusMsg : "분발하세요.");
	}
}
