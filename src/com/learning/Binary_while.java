package com.learning;
import java.util.Scanner;

public class Binary_while {

	public static void main(String[] args) {
		Scanner var = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num = var.nextInt();
		int i = 31;
		while(i>=0)
		{
			System.out.print(num>>i&1);
			i--;
		}
		
	}

}
