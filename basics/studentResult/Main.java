package com.studentResult;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//Create Student object
		Student student = new Student();
		
		//Take student information
		System.out.println("Enter student name: ");
		student.name= sc.nextLine();
		
		System.out.println("Enter roll number: ");
		student.rollNo = sc.nextInt();
		
		System.out.println("Enter english marks: ");
		student.english = sc.nextInt();
		
		System.out.println("Enter maths marks: ");
		student.maths = sc.nextInt();
		
		System.out.println("Enter science marks: ");
		student.science = sc.nextInt();
		
		ResultCalculator calculator = new ResultCalculator();
		
		
		//calculate result
		int result = calculator.calculateTotal(student);
		double percentage = calculator.calculatePercentage(result);
		
		String resultStatus = calculator.checkResult(percentage);
		
		//Display result
		System.out.println("\n===== Student Result =====");
		
		System.out.println("Name: "+ student.name);
		System.out.println("Roll No: "+ student.rollNo);
		
		System.out.println("English:"+ student.english);
		System.out.println("Mathematics: "+ student.maths);
		System.out.println("Science: "+ student.science);
		
		System.out.println("Total: "+result);
		
		System.out.println("Percentage: " +percentage );
		
		System.out.println("Result: " + resultStatus);
		

	}

}
