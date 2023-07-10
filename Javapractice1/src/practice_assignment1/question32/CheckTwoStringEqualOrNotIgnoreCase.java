package practice_assignment1.question32;

import java.util.Scanner;

public class CheckTwoStringEqualOrNotIgnoreCase {
	// Check two strings are equal or not. IGNORE THE CASE.
	//for ex-"abcde" is same as"AbCdE".

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in) ;
		System.out.println("Enter the first number");
		String s1= sc.next() ;
		System.out.println("Enter the second number");
		String s2=sc.next() ;
		System.out.println(s1.equalsIgnoreCase(s2));
	}
}
