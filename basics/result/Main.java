package com.result;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		//Take student Information
		System.out.println("Enter student name: ");
		student.name = sc.nextLine();
		
		System.out.println("Enter roll number: ");
		student.rollNo = sc.nextInt();
		
		System.out.println("Enter English Marks: ");
		student.english = sc.nextInt();
		
		System.out.println("Enter Maths: ");
		student.maths = sc.nextInt();
		
		System.out.println("Enter Science: ");
		student.science = sc.nextInt();
		
		
		ResultCalculator resultCalculator = 
				new ResultCalculator();
		
		int total = resultCalculator.calculateTotal(student);
		
		//Display Results;
		System.out.println("Name:" + student.name);
		System.out.println("Total:" + total);
		
		
		
	}

}
