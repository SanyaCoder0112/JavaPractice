
package practice_assignment1.question5;

import java.util.Scanner;

public class PrintSumAndAvgOf5Num {
	// Write a program in Java to input 5 numbers from keyboard and find their sum
	// and average.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int sum = a + b + c + d + e;
		System.out.println(sum);
		Double avg = (double) ((a + b + c + d + e) / 5);
		System.out.println(avg);
	}
}
