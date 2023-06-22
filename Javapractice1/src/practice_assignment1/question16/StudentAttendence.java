package practice_assignment1.question16;
import java.util.*;
public class StudentAttendence{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter number of attended classes");
int attendedClass=sc.nextInt();
System.out.println("Total numer of classes");
int NumOfClass=sc.nextInt();
if(attendedClass>=((75/100)*NumOfClass)){
System.out.println("The student can sit for exam");
}
else{
System.out.println("Not eligible to sit in exam");
}
}
}
