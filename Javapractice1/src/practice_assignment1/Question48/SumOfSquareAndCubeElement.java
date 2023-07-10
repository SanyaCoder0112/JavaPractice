package practice_assignment1.Question48;

import java.util.Scanner;

public class SumOfSquareAndCubeElement{
	//Find sum of squares and sum of cubes all the elements in array:


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements ");
		int n = sc.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			int SquaresOfElements = arr[i] * arr[i];
			System.out.println("Square of elements is " + SquaresOfElements);
			int CubesOfElements = arr[i] * arr[i] * arr[i];
			System.out.println("Cube of elements is " + CubesOfElements);
		}
	}
}
