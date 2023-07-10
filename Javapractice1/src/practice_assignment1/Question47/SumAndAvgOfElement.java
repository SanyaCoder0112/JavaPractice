package practice_assignment1.Question47;

import java.util.Scanner;

public class SumAndAvgOfElement {
	//Find the sum and average of all elements in array:

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements ");
		int n = sc.nextInt();

		int sum = 0;

		double avg = 0;
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			sum = sum + arr[i];
			System.out.println("The sum is " + sum);
			avg = (sum) / n;
			System.out.println("The average is " + avg);
		}
	}
}
