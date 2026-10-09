package com.studentResult;

public class ResultCalculator {
	int calculateTotal(Student student) {
		return student.english
				+student.maths
				+student.science;
		
	}
	
	double calculatePercentage(int total) {
		return total/3.0;
	}
	
	String checkResult(double percentage) {
		if (percentage >= 40) {
			return "PASS";
		}else {
			return "FAIL";
		}
	}

}
