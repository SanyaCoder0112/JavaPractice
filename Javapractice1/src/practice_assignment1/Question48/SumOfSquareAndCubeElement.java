package practice_assignment1.Question48;

import java.util.Scanner;

public class SumOfSquareAndCubeElement{
	//Find sum of squares and sum of cubes all the elements in array:


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements ");
		int n = sc.nextInt();

		int[] arr = new int[n];
		int SquaresOfElements=0;
		int CubesOfElements=0;
		System.out.println("please all the elements of array ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			//to take value inn array.
		}
		for (int i = 0; i < n; i++) {
			 SquaresOfElements = arr[i] * arr[i];//2*2//
			 System.out.println(SquaresOfElements);
			 CubesOfElements = arr[i] * arr[i] * arr[i];
			 System.out.println(CubesOfElements);

		}
		System.out.println("Square of elements is " + SquaresOfElements);
		
		System.out.println("Cube of elements is " + CubesOfElements);
	
	}
}
