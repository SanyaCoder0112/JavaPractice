package practice_assignment1.Question75;

import java.util.Scanner;

public class PeakElementInArray {
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of elements ");
int n=sc.nextInt();
int[] arr=new int[n];
int peakCount=0;
System.out.println("please all the elements of array ");

for(int i=0;i<n;i++)
{
	arr[i]=sc.nextInt();
	//to take value inn array.
}
for(int i=0;i<n;i++){
if(arr[i]> arr[i+1] && arr[i]>arr[i-1]){
  peakCount++;
System.out.println("The number of peak elements are " +peakCount);
}
}
}
}
