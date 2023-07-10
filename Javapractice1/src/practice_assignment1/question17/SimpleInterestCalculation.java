package practice_assignment1.question17;

import java.util.Scanner;

public class SimpleInterestCalculation {
	//WAP to find the simple interest. PRT all three will be user input.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of p");
		int p = sc.nextInt();
		System.out.println("enter the value of r");
		int r = sc.nextInt();
		System.out.println("enter the value of t");
		int t = sc.nextInt();

		int SI = (p * r * t) / 100;
		System.out.println("The SI value is:" + SI);
	}
}
