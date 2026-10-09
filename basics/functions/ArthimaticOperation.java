package com.functions;

import java.util.Scanner;

public class ArthimaticOperation {
	
	static void display(int result) {
		System.out.println("Result: " + result);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//Take input from user
		System.out.println("Enter first number: ");;
		int num1 = sc.nextInt();
		
		System.out.println("Enter second number: ");;
		int num2 = sc.nextInt();
		
		String name = sc.nextLine();
		
		Addition addition = new Addition();
		Substraction substraction = new Substraction();
	
		display(addition.add(num1,num2));
		display(substraction.substract(num1, num2));

	}

}


