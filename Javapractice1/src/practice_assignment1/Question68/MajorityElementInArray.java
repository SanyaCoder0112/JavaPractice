package practice_assignment1.Question68;

import java.util.Scanner;

public class MajorityElementInArray {
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
boolean[] visited=new boolean[n];
Arrays.fill(visited,false);
for(int i=0;i<arr.length;i++){
if(visited[i]==true){
continue;
}
}
int count=1;
for(int j=i+1;j<n;j++){
if(arr[i]==arr[j]){
visited[j]=true;
count++;
}
}
if(count>n/2){
System.out.println("This is the majority element"); 
}
}
}
