package practice_assignment1.Question44;



//Smallest element in array.

import java.util.Scanner;
public class SmallestElement{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of elements ");
int n=sc.nextInt();
int min=Integer.MAX_VALUE;
int[] arr = new int[n];
System.out.println("please all the elements of array ");
for(int i=0;i<n;i++)
{
	arr[i]=sc.nextInt();
	//to take value inn array.
}
for (int i = 0; i < n; i++) {

//if(arr[i]<min){
//min=arr[i];
//}
	min=Math.min(arr[i], min);
}
System.out.println("The smallest element is " +min);

}
}