//4.printWeekDayNameFrom1to7

package practice_assignment1.question4;

import java.util.Scanner;

public class PrintWeekDayNameFrom1to7 {
	// Take a number from user
	// If the number is between 1 and 7 then print the days of the week accordingly
	// For example-if user gives 1 then print Monday if 2 print Tuesday and so on
	// And if the user
	// gives any number less than 1 or greater than 7 then print"Invalid Number"
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if (num == 1) {
			System.out.println("Sunday");
		} else if (num == 2) {
			System.out.println("Monday");
		} else if (num == 3) {
			System.out.println("Tuesday");
		} else if (num == 4) {
			System.out.println("Wednesday");
		} else if (num == 5) {
			System.out.println("Thursday");
		} else if (num == 6) {
			System.out.println("Friday");
		} else {
			System.out.println("Saturday");
		}
	}

}
