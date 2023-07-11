package practice_assignment1.Question49;

import java.util.Scanner;

public class CheckIfArrayContainsAnElement {
	// Write a java program to test if an array contains a specific value.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		boolean flag=false;// pahle flag ko negtaive set kiye 
		System.out.println("please enter  all the elements of array ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			//to take value inn array.
		}
		System.out.println("Enter any number");
		int x = sc.nextInt();
		for (int i = 0; i < n; i++) {
			if (x==arr[i]) {
				flag=true;
				

		}
				//flag=true;// agar vo element artray me present hai to flag ka value yahan array loop me change ho jayega 
				//bina flag ke use se nhi kar sakte hai? na kyunki bar bar staement print hoga na jab harek iteration me jab jab elemnet milega
				 // ya nhi milega tab tab print sstatement execute hoga wait i will show you 
			System.out.println("The array contains this element");
			}
		else{
			
				
				System.out.println("The array does not contains this element");

			}	
		
		

}
	
}
