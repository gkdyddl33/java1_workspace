package store;

import java.util.Scanner;

public class ArrTask {
	public static void main(String[] args) {
		// �Ϲ� �����, ȫ����, ������
		String bonusMsg = ""; // �μ�Ƽ�� ������ ���� ����
		int bonus = 0;
		
		//��ī
		int[][] arrincome = new int[3][2];
		String[] arBranchName = {"�����","ȫ����","������"};
		String[] arAgeName = {"�Ϲ���","Ű����"};
		
		//��ī ���հ� ����� �迭
		int[] arBranchTotal = new int[3];
		double[] arBranchAvg = new double[2];
		
		int[] arAgeTotal = new int[2];
		double[] arAgeAvg = new double[2];
		
		int total = 0;
		double avg = 0.0;
		
		// ���������ڷ� �ѱ��� ���ϱ�
		int length = 0;
		boolean check;
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < arrincome.length; i++) {
			length += arrincome[i].length;
			
			for (int j = 0; j < arrincome[i].length; j++) {
				System.out.println(arBranchName[i]+""+arAgeName[j]+"����� �Է�(����:����):");
				arrincome[i][j] = sc.nextInt();
				arBranchTotal[i] += arrincome[i][j];
				arAgeTotal[j] += arrincome[i][j];
				total += arrincome[i][j];
			}
			arBranchAvg[i] = Double.parseDouble(String.format("%.2f", (double)arBranchTotal[i]/arrincome[i].length));
						
		}
		// �����,����
		avg = Double.parseDouble(String.format("%.2f", (double)total/length));
		for (int i = 0; i < arAgeAvg.length; i++) {
			arAgeAvg[i] = Double.parseDouble(String.format("%.2f", (double)arAgeTotal[i]/arrincome.length));
		}
		
		// �μ�Ƽ�� ���� ���
		bonusMsg = "���μ�Ƽ�� �����\n";
		for (int i = 0; i < arrincome.length; i++) {
			for (int j = 0; j < arrincome[i].length; j++) {
				if(arrincome[i][j]>avg)
				{
					bonusMsg += arBranchName[i]+""+arAgeName[j]+"\n";
					check = true;
				}
			}
		}
		System.out.println(check? bonusMsg : "�й��ϼ���.");
	}
}
