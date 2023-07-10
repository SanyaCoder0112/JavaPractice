package practice_assignment1.question13;

import java.util.Scanner;

public class BonusOf5Percent {
	// A company decided to give bonus of 5% to employee if his/her year of service
	// is more than 5 years. Ask user for their salary and year of service and print
	// the net bonus amount.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Double Salary = 50000.0;
		System.out.println("Enter number of year of service");
		int yos = sc.nextInt();
		if (yos > 5) {
			Salary = 1.05 * Salary;
			System.out.println(Salary);
		} else {
			System.out.println("No bonus would be applied");
		}
	}
}