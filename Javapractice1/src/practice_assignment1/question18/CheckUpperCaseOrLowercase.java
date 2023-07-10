
package practice_assignment1.question18;

import java.util.Scanner;

public class CheckUpperCaseOrLowercase {
	// 18. Write a program to check whether a entered character is lowercase ( a to
	// z ) or uppercase ( A to Z ).

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character");
		String a = sc.next();
		char b = a.charAt(0);
		if (b >= 65 && b <= 90) {
			System.out.println("Upppercase");
		} else {
			System.out.println("Lowercase");
		}
	}
}