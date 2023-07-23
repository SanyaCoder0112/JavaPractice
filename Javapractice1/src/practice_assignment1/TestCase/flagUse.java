package practice_assignment1.TestCase;

import java.util.Scanner;

public class flagUse {
//Check given number is present or not
	public static void main(String[] args) {
		boolean flag=false;
				Scanner sc = new Scanner(System.in);
		int arr[] = { 1, 2, 3, 4, 4 };
		System.out.println("Enter any number");
		
		int x = sc.nextInt();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == x) {
				System.out.println("The element is present ");
		
			flag=true;
			break;
			}
		}
		if(!flag) {
			System.out.println("The element is not present");
		}
		//when we use void then we can't return anything.
		

	}
}
