package practice_assignment1.question3;

import java.util.Scanner;

public class SumFrom1To5 {
	// Take two inputs from user a and b and find the sum from a to b
	//For example a=0 and b= 5

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i <= 5; i++) {
			sum = sum + i;
			System.out.println(sum);
		}

	}
}
