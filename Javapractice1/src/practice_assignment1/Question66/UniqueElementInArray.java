package practice_assignment1.Question66;

import java.util.Scanner;

public class UniqueElementInArray {
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
   for(int j=0;j<n;i++){
if(arr[i] !=arr[j]){
System.out.println(arr[i]);
}
}
}
}
}

