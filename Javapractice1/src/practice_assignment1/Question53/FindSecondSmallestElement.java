package practice_assignment1.Question53;

import java.util.Scanner;
//public class FindSecondSmallestElement {
//	//Write a Java program to find the second smallest element in an array.
//
//	public static void main(String[] args){
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the number of elements ");
//		int n=sc.nextInt();
//		int[] arr=new int[n];
//		
//		System.out.println("please enter  all the elements of array ");
//		for(int i=0;i<n;i++)
//		{
//			arr[i]=sc.nextInt();
//			//to take value inn array.
//		}
//arr.sort()
//
//		for(int i=0;i<n;i++){
//		int min=Integer.MAX_VALUE;
//		int SecondMin=0;
//		if(arr[i]<min && arr[i]!=min){
//		SecondMin=arr[i];
//
//		System.out.println(min);
//		}
//		}
//		}
//		}
//
//
//
//
//
//
//secondsmallest= 
//








	static void FindSecondSmallestElement(int arr[])
	{
		int first, second, arr_size = arr.length;

		
		if (arr_size < 2) {
			System.out.println(" Invalid Input ");
			return;
		}

		first = second = Integer.MAX_VALUE;
		for (int i = 0; i < arr_size; i++) {
			
			if (arr[i] < first) {
				second = first;
				first = arr[i];
			}

			
			else if (arr[i] < second && arr[i] != first)
				second = arr[i];
		}
		if (second == Integer.MAX_VALUE)
			System.out.println("There is no second"
							+ "smallest element");
		else
			System.out.println("The smallest element is "
							+ first
							+ " and second Smallest"
							+ " element is " + second);
	}

	
	public static void main(String[] args)
	{
		int arr[] = { 12, 13, 1, 10, 34, 1 };
		print2Smallest(arr);
	}
}

