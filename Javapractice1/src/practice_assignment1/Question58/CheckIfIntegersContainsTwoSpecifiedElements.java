package practice_assignment1.Question58;

import java.util.Scanner;

public class CheckIfIntegersContainsTwoSpecifiedElements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements ");
		int n = sc.nextInt();

		int[] arr = new int[n];
		boolean flag = false;
		System.out.println("please enter  all the elements of array ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			// to take value inn array.
		}

		for (int i = 0; i < n; i++) {
			if (arr[i] == 65 && arr[i] == 77) {

				System.out.println("The array contains the elements");
				flag = true;

		
			break;
			}

		}
		if (!flag) {
			System.out.println("The array does not contains the elements");
		}

	}
}
