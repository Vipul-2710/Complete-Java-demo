package com.basics;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		
		int num1 = 7;
		int num2 = 9;
		
		String name;
		name = "Amol";
		
		long num3 = 4000000;
		
		float num4 = 10.5f;
		
		double num5 = 10.666666666;
		
		char letter = 'a';
		
		boolean is_pallindrom = true;
		
		System.out.println("Addition is " + (num2+num1));
		System.out.printf("Substraction is %d %d %d \n",(num2-num1),num1,num2);
		System.out.println(name);
		
		int age = 8;
		if (age>13 && age<=18) {
			System.out.println("Teenager");
		}else if (age>18) {
			System.out.println("Adult");
		}else {
			System.out.println("Balak");
		};
		

		
		
//		for (int i=0; i<10;i++) {
//			
//			if (i%2 == 0 ) {
//				System.out.println("Even:"+ i);
//			}
//		};
//		
		//Count the factors
		//start time
		long start = System.nanoTime();
		int num = 1000000000;
		int counter=1;
		int count=0;
		while (counter<=num) {
			
			if (num % counter == 0) {
				count++;
			};
			counter++;
			
		}System.out.println("Factor Count: "+count);
		
		//end time
				long end = System.nanoTime();
				
		        long executionTime = end - start;

		        System.out.println("Execution time: "
		                + executionTime + " nanoseconds");

		        System.out.println("Execution time: "
		                + (executionTime / 1_000_000.0) + " milliseconds");

		
//		int counter = 0;
//		while (counter<10) {
//			System.out.println(counter);
//			
//			if (counter == 5) {
//				continue;
//			}
//			
//			counter++;
//		}
		
		
	}

}
