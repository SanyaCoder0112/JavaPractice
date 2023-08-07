package practiceProgramIkea6Aug;

import java.util.Scanner;

public class DisplaySumOfDigit {
	public static int sumOfDigits(int num) {
		int sum = 0;
		int rem = 0;
		while (num >0) {
			rem = num % 10;
			sum = sum + rem;
			num=num/10;
		}
		return sum;
	}

	public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
		    System.out.println("Enter num");
		    int x=sc.nextInt();

		int summation = sumOfDigits(x);

		System.out.println("The sum of digits is: " + summation);
	}
}
