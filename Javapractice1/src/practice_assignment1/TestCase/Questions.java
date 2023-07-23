package practice_assignment1.TestCase;

import java.util.Scanner;

public class Questions {
	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println("\t" + arr[i]);
		}
	}
//method
	public int[] indexMethod(int[] arr) {
		int index = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 1) {
				index = i;
				break;

			}
		}
		int[] result = new int[arr.length];
		if (index > -1) {
			for (int i = 0; i < arr.length - index; i++) {
				result[i] = 1;
				// by default rest of the index which is not 1 will have the value of 0.
			}
		}
		return result;

	}

	public int[] copy(int[] arr) {
		int[] copy = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			copy[i] = arr[i];
		} //// we are psssing copy of the actual array to prevent passing of input array
			//// again
		return copy;
	}

	
	public static void main(String[] args) {
		// 5 0 0 0 1 1
		// 5 0 0 1 1 1
		Questions ra = new Questions();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no. of elements in the array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		int[] result = new int[n];
		System.out.println("Enter the elements of the array: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Input array is: ");
		print(arr);
		System.out.println("Output of index method: ");
		result = ra.indexMethod(ra.copy(arr));
		print(result);
	}
}

//{1,2,3,4,5,6}
//