package practice_assignment1.Question51;

import java.util.Scanner;

public class PrintCommonElementsOfTwoArray {

	// 51.take two arrays of same size from user and print all the common elements
	// between them.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements ");
		int n = sc.nextInt();

		int[] arr1 = new int[n];
		int[] arr2 = new int[n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; i++) {
				if (arr1[i] == arr2[j]) {
					System.out.println(arr1[i]);
				}
			}
		}
	}
}