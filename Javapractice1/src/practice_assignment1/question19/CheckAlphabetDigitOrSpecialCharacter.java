package practice_assignment1.question19;

import java.util.Scanner;

public class CheckAlphabetDigitOrSpecialCharacter {
	// Write a program to input any character and check whether it is alphabet,
	// digit or special character.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character");
		String a = sc.next();
		char b = a.charAt(0);
		if (b >= 65 && b <= 90|| b>=97 && b<=127) {
			System.out.println("Albhabet");
		} else if(b>=48 && b<=57){
			System.out.println("Digit");
		}
		else {
			System.out.println("special character");
		}
	}
}
