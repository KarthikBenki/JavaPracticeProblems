package com.learning;

import java.util.Scanner;

public class BinaryDoWhile {

	public static void main(String[] args) {
Scanner var = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num = var.nextInt();
		int i = 31;
		do
		{
			System.out.print(num>>i&1);
			i--;
		}while(i>=0);

	}

}
