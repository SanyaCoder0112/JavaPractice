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
for(int i=0;i<n;i++){
if(arr[i]<min){
min=arr[i];
System.out.println(min);
}
else(arr[i]>max){
min=arr[i];
System.out.println(max);
}
int diff=0;
diff={(max=arr[i])-(min=arr[i])};
System.out.println("The difference is " +diff);
}
}
}
