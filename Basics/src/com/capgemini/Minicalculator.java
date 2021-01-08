package com.capgemini;

import java.util.Scanner;

public class Minicalculator {
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	
	int num,a=0,b=0;
	char ch='Y';
	
	do
	{
		System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Exit");
		System.out.println("Enter a number for operation: ");
		num=sc.nextInt();
		if(num!=5)
		{
			System.out.println("Enter two numbers: ");
			a=sc.nextInt();
			b=sc.nextInt();
		}
		
		switch(num)
		{
			case 1:System.out.println("Addition Result: "+(a+b));
			       break;
			case 2:System.out.println("Subtraction Result: "+(a-b));
			       break;
			case 3:System.out.println("Multiplication Result: "+(a*b));
			       break;
			case 4:System.out.println("Division Result: "+(a/b));
			       break;
			case 5:System.exit(0);
			       break;
			default:System.out.println("Sorry! You entered wrong choice");
		}
	}while(ch=='Y'||ch=='y');
	
	sc.close();

}
}
