package practice_assignment1.Question52;
//Write a java program to find the second largest elememt in second largest element in array.

import java.util.Scanner;

public class FindSecondLargestElement{


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements ");
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			int max = Integer.MIN_VALUE;
			int SecondMax = 0;
			if (arr[i] > max && arr[i] != max) {
				SecondMax = arr[i];

				System.out.println(max);
			}
		}
	}
}
