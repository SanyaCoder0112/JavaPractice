package practice_assignment1.question36;

import java.util.Scanner;

public class CountNumberOfSpace {
	// 36. WAP to count the number of spaces in a string.

	public static int countSpaces(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		String str = "This is a java code and we are having fun and learn";

		System.out.println("This is my first method " + (str.split(" ").length - 1));

		System.out.println(
				"This is second method " + countSpaces("This is a java code and we are doing assignment practice"));
	}
}
/* package practice_assignment1.question36;

import java.util.Scanner;

public class CountNumberOfSpace {
	// 36. WAP to count the number of spaces in a string.

	
	String str="This is a java code";
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				count++;
			}
		}
syso(count);
*/