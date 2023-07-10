package practice_assignment1.Question46;

import java.util.Scanner;

public class IndexOfMinElement{
	//Find position of minimum element in array:


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int min = Integer.MAX_VALUE;
		System.out.println("Enter the number of elements ");
		int n = sc.nextInt();
		int minIndex = 0;
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			if (arr[i] < min) {
				min = arr[i];
				minIndex = i;
				System.out.println("The position of minimum index is " + minIndex);
			}
		}
	}
}
