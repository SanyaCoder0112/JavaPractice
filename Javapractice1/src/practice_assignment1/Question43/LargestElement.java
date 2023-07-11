package practice_assignment1.Question43;

import java.util.Scanner;

public class LargestElement {
	//Largest element in array
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = Integer.MIN_VALUE;

		System.out.println("Enter the number of elements ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("please all the elements of array ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			//to take value inn array.
		}
		for (int i = 0; i < n; i++) {
			
//			if (arr[i] > max) {
//				max = arr[i];
//			}
			max=Math.max(arr[i], max);
		}
				System.out.println("The maximum element is " + max);
			
		}
	
}