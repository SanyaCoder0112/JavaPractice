package practice_assignment1.question61;

//Write a Java program to remove a specific element from an array.
//for example -> [1 , 2, 3] -> remove 2 then new array should be -> [1 , 3], note -> 
//remove all instance of element i.e if user says remove element 2 then remove all 2's from the array.

import java.util.Scanner;

public class RemoveAnElementFromArray{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {

			arr[i] = arr[i + 1];
			System.out.println(arr[i]);
		}
	}
}
