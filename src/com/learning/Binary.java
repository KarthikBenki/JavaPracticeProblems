package com.learning;
import java.util.Scanner;
public class Binary {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int i;
		int num1;
		for(i=31;i>=0;i--)
		{
			System.out.print(num>>i&1);
		}
		
	
	}

}
