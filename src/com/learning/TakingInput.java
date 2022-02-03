package com.learning;	
import java.util.Scanner;

public class TakingInput {
	public static void main(String[] args) {
		System.out.println("Taking inputs from user");
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the first number");
//		int a = sc.nextInt();
//		float a = sc.nextFloat();
//		System.out.println("Enter the second number");
//		int b = sc.nextInt();
//		float b = sc.nextFloat();
//		int sum = a + b;
//		float sum = a + b;
//		System.out.println("The sum of a+b is");
//		System.out.println(sum);
//		String str =sc.next();
//		String str =sc.nextLine();
//		System.out.println(str);
		boolean b1 = sc.hasNextInt();
		System.out.println(b1);
	
	}

}
