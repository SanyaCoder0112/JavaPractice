package practice_assignment1.Question57;

import java.util.Scanner;
public class CheckSumOfAllElementIs30OrNot{
	//57. Write a Java program to check if the sum of all the 10's in the array is exactly 30. Return false if the condition does not satisfy, otherwise true.

public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int count=0;
System.out.println("Enter the number of elements ");
int n=sc.nextInt();
int[] arr=new int[n];
System.out.println("please enter  all the elements of array ");
for(int i=0;i<n;i++)
{
	arr[i]=sc.nextInt();
	//to take value inn array.
}
for(int i=0;i<n;i++){
	if(arr[i]==10) {
		count++;
		
		
	}	
	}
	if(count==3) {
		System.out.println("the sum is 30");
	}
		else {
			System.out.println("the sum is not 30");
		}
	}



}

