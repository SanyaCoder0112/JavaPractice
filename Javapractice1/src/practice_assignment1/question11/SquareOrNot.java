package practice_assignment1.question11;

import java.util.Scanner;

public class SquareOrNot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of a");
		int a = sc.nextInt();
		System.out.println("Enter value of b");
		int b = sc.nextInt();

		if (a == b) {
			System.out.println("It is Square");
		} else {
			System.out.println("It is not Square");
		}
	}
}