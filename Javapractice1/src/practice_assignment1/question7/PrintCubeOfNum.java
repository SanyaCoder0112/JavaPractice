package practice_assignment1.question7;

import java.util.Scanner;

public class PrintCubeOfNum {
	//WAP to print cube of a number (user input).
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = sc.nextInt();
		int cub = a * a * a;
		System.out.println("The area of Cube is: " + cub);

	}
}
