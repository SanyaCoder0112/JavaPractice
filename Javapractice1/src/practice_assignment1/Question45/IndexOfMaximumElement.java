package practice_assignment1.Question45;

//Find position of maximum element in array.

import java.util.Scanner;

public class IndexOfMaximumElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		int maxIndex = 0;
		int max = Integer.MIN_VALUE;
		System.out.println("please all the elements of array ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			//to take value inn array.
		}
		for (int i = 0; i < n; i++) {
			if (arr[i] > max) {
				max = arr[i];
				maxIndex=i;
			}
		}
		System.out.println("index of maximum element is "+maxIndex);

	}
}