package practice_assignment1.question9;

import java.util.Scanner;

public class AreaOfCircle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of rdius");
		int r = sc.nextInt();
		Double area = Math.PI * r * r;
		System.out.println("The area of Circle is: " + area);
	}
}