package practice_assignment1.question24;

import java.util.Scanner;

//S (if capital letter - class or interface) util(small letter - package)
public class CountNumberOfDigits {
	// 24. Write a Java program that reads an positive integer and count the number
	// of digits the number has.

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a = sc.nextInt();
		int count = 0;
		while (a > 0) {

			count++;
			a = a / 10;
		}
		System.out.println(count);

	}

}
//string constant pool is immutable
//heap stores stringbuildewr