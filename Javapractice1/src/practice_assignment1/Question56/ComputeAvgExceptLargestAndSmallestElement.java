package practice_assignment1.Question56;

import java.util.Scanner;
public class ComputeAvgExceptLargestAndSmallestElement{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of elements ");
int n=sc.nextInt();
int max=Integer.MIN_VALUE;
int min=Integer.MAX_VALUE;
int[] arr=new int[n];
for(int i=0;i<n;i++){
if(arr[i]<min){
min=arr[i];

if(arr[i]>max){
min=arr[i];

int sum=0;
sum=sum+arr[i];
double avg=((sum-{max,min})/(n-2));
system.out.println("The average is " +avg);
}
}
}

