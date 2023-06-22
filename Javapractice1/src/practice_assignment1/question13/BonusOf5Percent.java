package practice_assignment1.question13;
import java.util.*;
public class BonusOf5Percent{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
Double Salary =50000.0;
System.out.println("Enter number of year of service");
int yos=sc.nextInt();
if(yos>5){
Salary=1.05*Salary;
System.out.println(Salary);
}
else{
System.out.println("No bonus would be applied");
}
}
}