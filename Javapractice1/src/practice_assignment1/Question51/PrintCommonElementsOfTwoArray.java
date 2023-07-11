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
		System.out.println("please enter  all the elements of array 1");
		for(int i=0;i<n;i++)
		{
			arr1[i]=sc.nextInt();
			//to take value inn array.
		}
		System.out.println("please enter  all the elements of array 2 ");
		for(int i=0;i<n;i++)
		{
			arr2[i]=sc.nextInt();
			//to take value inn array.
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n-1; i++) {
				if (arr1[i] == arr2[j]) {
				}
			}
					System.out.println(arr1[i]);
				}
			
	}
}

//logic wrong do again