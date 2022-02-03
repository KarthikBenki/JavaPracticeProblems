package com.learning;
import java.util.Scanner;

public class Percentage {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks of a cbse student out of 100");
		int mark1 = sc.nextInt();
		int mark2 = sc.nextInt();
		int mark3 = sc.nextInt();
		int mark4 = sc.nextInt();
		int mark5 = sc.nextInt();
		
		int sum = mark1+mark2+mark3+mark4+mark5;
		
		System.out.println("the total marks of a student out of 500 is");
		System.out.println(sum);
		
		float per = ((float)sum/500)*100;
		System.out.println("the percentage of a cbse student  out of 100  ");
		System.out.println(per);		
		
	}

}
