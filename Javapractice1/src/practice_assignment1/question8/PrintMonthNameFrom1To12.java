package practice_assignment1.question8;

import java.util.Scanner;

public class PrintMonthNameFrom1To12 {
	// Take a number from user If the number is between 1 and 12
	// then print the month of the year accordingly For example-if user gives 1
	// then print January if 2 print February and so on And if the user gives any
	// number less than 1 or greater than 12 then print"Invalid Month".

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		if (num == 1) {
			System.out.println("January");
		} else if (num == 2) {
			System.out.println("February");
		} else if (num == 3) {
			System.out.println("March");
		} else if (num == 4) {
			System.out.println("April");
		} else if (num == 5) {
			System.out.println("May");
		} else if (num == 6) {
			System.out.println("June ");
		} else if (num == 7) {
			System.out.println(" July");
		} else if (num == 8) {
			System.out.println("August");
		} else if (num == 9) {
			System.out.println("September");
		} else if (num == 10) {
			System.out.println("October");
		} else if (num == 11) {
			System.out.println("November");
		} else if (num == 12) {
			System.out.println("December");
		} else {
			System.out.println("Invalid Input");
		}
	}
}