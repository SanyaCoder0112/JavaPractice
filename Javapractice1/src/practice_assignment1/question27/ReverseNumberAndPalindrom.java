package practice_assignment1.question27;

import java.util.Scanner;

public class ReverseNumberAndPalindrom {
	public static void main(String[] args) {
		// A five-digit number is entered through the keyboard. Write a program to
		// obtain the reversed number and to determine whether the original and reversed
		// numbers are equal or not.
		Scanner sc=new Scanner(System.in) ;
		System.out.println(" Enter the five digit no. ");
		int a=sc.nextInt();
		int temp=a;
		int reverse=0;
		for(int i=0; i<5; i++) {
		reverse=reverse*10 + a%10;
		System.out.println(" Obtained reverse number "+ reverse);
		if(a==reverse) {
		System.out.println(" It is palindrome");
		}
		else{
			System.out.println("It is not palindrome") ;
		}
		sc.close() ;
	}
}
}
