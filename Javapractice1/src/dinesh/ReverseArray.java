package dinesh;

import java.util.Scanner;

public class ReverseArray {
	
	
	public static void print(int[] arr) {
		for(int i=0; i< arr.length; i++) {
			System.out.println("\t" + arr[i]);
		}
	}
	
	public int[] ankita1(int[] arr) {
		int[] reverse = new int[arr.length];
		for(int i=arr.length-1;i>=0;i--) {
			reverse[arr.length - i - 1] = arr[i];
		}
		return reverse;
	}
	
	public int[] reverseTwoPointer(int[] arr) {
		int temp = 0;
		for(int i=0; i<arr.length/2; i++) {
			temp = arr[i];
			arr[i] = arr[arr.length - 1- i];//we need to move both side at the same time so in this case it is not necessary to take 
			// two pointer left and right
			arr[arr.length -1 -i] = temp;
		}
		return arr;
	}
	
	public int[] indexMethod(int[] arr) {
		int index = -1;  
		for(int i=0; i< arr.length; i++) {
			if(arr[i] == 1) {
				index = i;
				break;
				
			}
		}
		int[] result = new int[arr.length]; 
		if(index>-1) {
		for(int i=0; i<arr.length-index ; i++) {
			result[i] = 1;
			//by default rest of the index which is not 1 will have the value of 0.
		}
		}
		return result;
	}
	
	public int[] sortArray(int[] arr) {
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == 1) {
				count++;
			}
		}
		int[] result = new int[arr.length];  //it is different from line no.83 because both are in different method
		for(int i=arr.length-count; i<arr.length; i++) {
			
			result[i] = 1;
		}
		return result;
	}
	
	public int[] copy(int[] arr) {
		int[] copy = new int[arr.length];
		for(int i=0; i<arr.length; i++) {
			copy[i] = arr[i];
		}//// we are psssing copy of the actual array to prevent passing of input array again
		return copy;
	}
	
	public static void main(String[] args) {
		// 5 0 0 0 1 1
		// 5 0 0 1 1 1
		ReverseArray ra= new ReverseArray();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no. of elements in the array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		int[] result = new int[n];
		System.out.println("Enter the elements of the array: ");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Input array is: ");
		print(arr);
		//end of taking input
		
		System.out.println("Output of ankita1: ");
		result = ra.ankita1(arr);
		print(result);
		
		System.out.println("Output of two pointer method: ");
		result = ra.reverseTwoPointer(ra.copy(arr)); // we are psssing copy of the actual array to prevent passing of input array again
		print(result);
		 
		System.out.println("Output of index method: ");
		result = ra.indexMethod(ra.copy(arr));
	    print(result);
		
		
//		use this to sort the array
//		System.out.println("Output of sortArray method: ");
//		result = ra.sortArray(ra.copy(arr));
//		print(result);
	}

}
