package dinesh;

import java.util.Scanner;

public class ReverseOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a 5 digit number: ");
		int a = sc.nextInt();
		int reverse = Integer.parseInt(new StringBuilder(String.valueOf(a)).reverse().toString());
//		int temp = a;
//		int reverse = 0;
//		
//		for(int i= 0; i<5; i++) {
//			reverse = reverse* 10 + temp%10;
//			temp /= 10;
//		}
		System.out.println("Obtained reverse number: " + reverse);

		if (a == reverse) {
			System.out.println("It is a palindrome");
		} else {
			System.out.println("It is not a palindrome");
		}

		// 227
		// reverse = 0*10 + 227%10 => 0 + 7 => 7
		// reverse = 7*10 + 22%10 => 70 + 2 => 72
		// reverse = 72*10 + 2%10 => 720 + 2 => 722
		sc.close();
	}

}
