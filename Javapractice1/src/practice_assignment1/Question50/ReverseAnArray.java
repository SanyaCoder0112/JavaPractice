package practice_assignment1.Question50;

import java.util.Scanner;

public class ReverseAnArray {
	//Write a java program to reverse an array of integer values.
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of elements ");
	int n=sc.nextInt();
	
	int[] arr=new int[n];
	int[] result=new int[n];
	
	System.out.println("please all the elements of array ");

	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
		//to take value inn array.
	}
	for(int i=0;i<arr.length;i++) {
		result[i]=arr[arr.length-i-1];
	
	}
	for(int i=0;i<arr.length;i++) {
		System.out.println(result[i]);
	}

}
}
