package practice_assignment1.Question54;

import java.util.Scanner;

public class NumberOfEvenAndOddNumElements {
	//Count number of odd and even element in array.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements ");
		int n = sc.nextInt();

		int counteven = 0;
		int countodd = 0;
		int[] arr = new int[n];
		
		System.out.println("please enter  all the elements of array ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			//to take value inn array.
		}

		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				counteven++;
				System.out.println("Number of even elements " + counteven);
			} else if (i % 2 != 0) {
				countodd++;
				System.out.println("Number of odd eklements " + countodd);
			}
			//either use flag or use count variable to count number of even inside if conditon and in lese 
			//condition or if we want to store multible array elemts then we should create anpother
			//and store values inside thta anrrar then print it 
			//we should not use print statement inside for loop because if we will put inside for loop then it will print statements 
			//every time the iter
			//iteration takes place...
		}
	}
}