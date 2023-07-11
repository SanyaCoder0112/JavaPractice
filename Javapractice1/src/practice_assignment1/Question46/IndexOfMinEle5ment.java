package practice_assignment1.Question46;

import java.util.Scanner;

public class IndexOfMinEle5ment{
	//Find position of minimum element in array:


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int min = Integer.MAX_VALUE;
		System.out.println("Enter the number of elements ");
		int n = sc.nextInt();
		int minIndex = 0;
		int[] arr = new int[n];
		System.out.println("please all the elements of array ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			//to take value inn array.
		}
		for (int i = 0; i < n; i++) {
			if (arr[i] < min) {
				min = arr[i];
				minIndex = i;
				System.out.println("The position of minimum index is " + minIndex);
			}
		}
	}
}
