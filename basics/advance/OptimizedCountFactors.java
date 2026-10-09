package com.advance;

public class OptimizedCountFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 1000000000;
		System.out.println(num);
		int i =1;
		int count = 0;
		//start time
		long start = System.nanoTime();
		
		while ( i * i <= num ) {
			if (num % i == 0) {
				if ( i == (num/i) ) {
					count++;
				}else {
					count+=2;
				}
			};i++;
		};System.out.printf("Factor Count:%d",count);
		
		//end time
		long end = System.nanoTime();
		
        long executionTime = end - start;

        System.out.println("Execution time: "
                + executionTime + " nanoseconds");

        System.out.println("Execution time: "
                + (executionTime / 1_000_000.0) + " milliseconds");

	}

}
