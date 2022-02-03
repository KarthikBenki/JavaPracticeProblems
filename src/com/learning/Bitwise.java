package com.learning;
import java.util.Scanner;

/*
 * 1. Write a program for the following one.
a) Set a bit b) Clear a bit c) Toggle a bit
 */

public class Bitwise {
	
	public static void printBinary(int num)
	{
		for(int i=31;i>=0;i--)
		{
			System.out.print(num>>i&1);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		System.out.println("The number before modification "+num);
		System.out.println("Binary of a given number is :");
		printBinary(num);
		System.out.println("Enter the pos from 0 to 31");
		int pos = sc.nextInt();
		System.out.println("Select \n1)Setbit\n2)Clearbit\n3)Togglebit\n");
		int sel = sc.nextInt();
		
		switch(sel)
		{
		case 1:
			System.out.println("Setbit selected");
			num=num|1<<pos;
			break;
		case 2:
			System.out.println("Clearbit selected");
			num=num&~(1<<pos);
			break;
		case 3:
			System.out.println("Togglebit selected");
			num=num^1<<pos;
			break;
		default:
			System.out.println("Invalid selection");
			break;
		}
		System.out.println("number after modification "+num);
		System.out.println("Binary of a modified number is :");
		printBinary(num);
		

	}

}
