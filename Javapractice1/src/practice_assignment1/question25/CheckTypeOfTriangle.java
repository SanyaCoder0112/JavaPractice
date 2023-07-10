package practice_assignment1.question25;

import java.util.Scanner;

public class CheckTypeOfTriangle {
	// Write a program to check whether the triangle is equilateral, isosceles or
	// scalene triangle.

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in) ;
		System.out.println("Enter the value of a ");
		int a = sc.nextInt() ;
		System.out.println(" Enter the value of b") ;
		int b = sc.nextInt() ;
		System.out.println("Enter the value of c") ;
		int c= sc.nextInt() ;
		if((a+b)==(a+c) && (a+b) ==(b+c)) {
			System.out.println("Equilateral Triangle");
		}
		else if((a+b) == (a+c)&& (a+b)!= (b+c) ||(a+b) ==(b+c) && (a+b)!=(a+b) ||(b+c)==(a+c) && (b+c)!=(a+b)) { 
			System.out.println("Isosceles Triangle ") ;
		}
		else{
			System.out.println(" Scalene Triangle ");
	}
}	
}
