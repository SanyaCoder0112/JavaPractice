package practice_assignment1.question14;
import java.util.*;
public class GradeOfStudent{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
int marks=sc.nextInt();
if(marks>80 && marks<=100){
System.out.println("A");
}
else if(marks>60 && marks<=80){
System.out.println("B");
}
else if(marks>50 && marks<=60){
System.out.println("C");
}
else if(marks>45 && marks<=50){
System.out.println("D");
}
else if(marks>25 && marks<=45){
System.out.println("E");
}
else if(marks<=25){
System.out.println("F");
}
else{
System.out.println("Invalid Input");
}
}
}
