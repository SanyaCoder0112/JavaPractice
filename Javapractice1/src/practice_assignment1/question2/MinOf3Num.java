package practice_assignment1.question2;

import java.util.Scanner;

public class MinOf3Num {
	//Find the minimum among three numbers
	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		int c = 12;
		if (a < b && a < c)
			System.out.println(a);

		else if (b < a && b < c) {
			System.out.println(b);
		} else {
			System.out.println(c);
		}
	}
}
