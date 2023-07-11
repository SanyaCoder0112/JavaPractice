package practice_assignment1.Question53;

import java.util.Scanner;
public class FindSecondSmallestElement {
	//Write a Java program to find the second smallest element in an array.

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("please enter  all the elements of array ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			//to take value inn array.
		}


		for(int i=0;i<n;i++){
		int min=Integer.MAX_VALUE;
		int SecondMin=0;
		if(arr[i]<min && arr[i]!=min){
		SecondMin=arr[i];

		System.out.println(min);
		}
		}
		}
		}

//logic wrong do again