package practice_assignment1.question6;

import java.util.Scanner;

public class PrintSquareOfNum {
	//WAP to print square of a number (user input).
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = sc.nextInt();
		int sqr = a * a;
		System.out.println("The area of Square: " + sqr);
	}
}