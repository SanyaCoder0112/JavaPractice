package practice_assignment1.question22;

import java.util.Scanner;

public class TwoStringsAreEqualOrNot {
	//Take 2 strings input from user and check whether they are equal or not.

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in) ;
		System.out.println("Enter the value of s1") ;
		String s1=sc.next() ;
		System.out.println("Enter the value of s2") ;
		String s2=sc.next() ;
		System.out.println(s1.equals(s2));
	}
}
