package practice_assignment1.Question49;

import java.util.Scanner;

public class CheckIfArrayContainsAnElement {
	// Write a java program to test if an array contains a specific value.


public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of elements ");
int n=sc.nextInt();
int[] arr=new int[n];


System.out.println("Enter any number");
int x=sc.nextInt();
for(int i=0;i<n;i++){
if(arr[i]==x){
System.out.println("The array contains this element");
}
else{
System.out.println("The array does not contains this element");
}
}
}
}
