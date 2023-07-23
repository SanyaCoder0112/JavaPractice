package practice_assignment1.Question70;

import java.util.Scanner;

public class SumOfAllPairInArray {
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of elements ");
int n=sc.nextInt();
int[] arr=new int[n];
int[] result=new int[n];

System.out.println("please all the elements of array ");

for(int i=0;i<n;i++)
{
	arr[i]=sc.nextInt();
	//to take value inn array.
}
for(int i=0;i<n;i++)
{
result[i]=arr[i]+ arr[i+1];
System.out.println(result[i]);
}
}
}
