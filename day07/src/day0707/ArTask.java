package day0707;

import java.util.Scanner;

public class ArTask {
	public static void main(String[] args) {
		//[초급]
		/*
		 * (1)
		int[] arData = new int[100];
		for (int i = 0; i < arData.length; i++) {
			arData[i] = i+1;
			System.out.println(arData[i]);
		}
		*(2)
		int[] arData = new int[50];
		for (int i = 0; i < arData.length; i++) {
			arData[i] = (i+1)*2;
			System.out.println(arData[i]);
		}
		*/
		/*(3)
		String arData = "ABCDEF";
		System.out.println(arData.charAt(0));
		System.out.println(arData);
		
		char[] arData = new char[6];
		for (int i = 0; i < arData.length; i++) {
			arData[i] = (char)(i+65);
			System.out.println(arData[i]);
		}
		
		char[] arData = new char[5];
		int temp = 0;
		for (int i = 0; i < arData.length; i++) {
			if(i>1)
			{
				temp++;
			}
			arData[i] = (char)(temp+65);
			System.out.println(arData[i]);
		}
		*/
		/*(4)
		Scanner sc = new Scanner(System.in);
		int size = 0;
		int[] arData = null;
		
		System.out.println("정수를 입력하세요:");
		size = sc.nextInt();
		String result = "";
		
		int max = 0;
		int min = 0;
		arData = new int[size];
		result += "[";
		for (int i = 0; i < arData.length; i++) {
			System.out.println(i+1+"번째 정수:");
			arData[i] = sc.nextInt();
			result += i == size-1 ? arData[i] : arData[i] + ",";
		}
		result += "]";
		System.out.println(result);
		
		max = arData[0];
		min = arData[0];
		for (int i = 0; i < arData.length; i++) {
			if(max < arData[i])
			{
				max = arData[i];
			}
			if(min > arData[i])
			{
				min = arData[i];
			}
		}
		System.out.println("최댓값:"+max);
		System.out.println("최소값:"+min);
		*/
		/*(6)
		Scanner sc = new Scanner(System.in);
		String str = null;
		String result = "";
		System.out.print("영어 입력:");
		str = sc.next();
		
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(c>=97&&c<=122) {
				result += (char)(c-32);
			}
			else if(c>=65&&c<=92) {
				result += (char)(c+32);
			}
			else {
				result += c;
			}
		}
		System.out.println(result);
		*/
		/*(7)*/
		String hangle = "공일이삼사오육칠팔구";
		String result = "";
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		System.out.println("정수입력:");
		num = sc.nextInt();
		
		while(num != 0) {
			result = hangle.charAt(num%10) + result;
			num /= num / 10;
		}
		System.out.println(result);
	}
}
