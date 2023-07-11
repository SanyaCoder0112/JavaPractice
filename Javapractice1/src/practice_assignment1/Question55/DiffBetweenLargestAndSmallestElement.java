package practice_assignment1.Question55;

import java.util.Scanner;

public class DiffBetweenLargestAndSmallestElement {
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of elements ");
int n=sc.nextInt();
int max=Integer.MIN_VALUE;
int min=Integer.MAX_VALUE;
int[] arr=new int[n];
int diff=0;
System.out.println("please all the elements of array ");

for(int i=0;i<n;i++)
{
	arr[i]=sc.nextInt();
	//to take value inn array.
}
for(int i=0;i<n;i++){
if(arr[i]<min){
min=arr[i];
System.out.println(min);
}
if(arr[i]> max){
max=arr[i];
System.out.println(max);
}
}
diff=max-min;
System.out.println("The difference is " +diff);

}
}
//if ke under hamesha ek condion is mandatory hai 
/// else if me bhi ek condition mandatory hai 
///inside else you cant give any condition it else
//else block cannot exist without it friend if block its always has a precedeing block
