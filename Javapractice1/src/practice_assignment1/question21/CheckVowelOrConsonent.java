package practice_assignment1.question21;

import java.util.Scanner;

public class CheckVowelOrConsonent {
	// 21. Write a Java program that takes the user to provide a single character
	// from the alphabet. Print Vowel or Consonant, depending on the user input.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character");

		char a = sc.next().toLowerCase().charAt(0);

		if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') {
			System.out.println("Vowel");
		} else if (a >= 97 && a <= 122) {
			System.out.println("Consonant");
		} else {
			System.out.println("Invalip Input");

		}
	}
}
