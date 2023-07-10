package practice_assignment1.Question62;

import java.util.Scanner;

public class InsertElementInArray {
	// Write a Java program to insert an element (specific position) into an array.
	// for ex-> [1 , 2, 3, 4] insert 6 at index 3 -> [1 , 2 , 3 , 6 , 4]

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i + 1] = arr[i];
			System.out.println(arr[i]);
		}
	}
}
