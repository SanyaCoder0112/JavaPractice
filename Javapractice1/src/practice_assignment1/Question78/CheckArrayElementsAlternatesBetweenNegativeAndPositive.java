package practice_assignment1.Question78;

import java.util.Scanner;

public class CheckArrayElementsAlternatesBetweenNegativeAndPositive{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of elements ");
int n=sc.nextInt();
int[] arr=new int[n];
System.out.println("please all the elements of array ");

for(int i=0;i<n;i++)
{
	arr[i]=sc.nextInt();
	//to take value inn array.
}

for(int i=0;i<n;i++){
    if(arr[i]>0 && arr[i+1]<0 || arr[i+1]>0 && arr[i]<0){
System.out.
println("The array contains alternative integers");
}
else{
System.out.println("The array does not contains alternative integers ");
}
}
}
}
