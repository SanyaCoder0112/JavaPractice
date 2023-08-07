//write a java program to convert kilometers to miles.

package youtube.CodeWithHarry;
import java.util.Scanner;
public class Lecture7PracticeQ4 {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	double miles=0.0;
	   System.out.println("Enter the kilometers ");
	   double k=sc.nextDouble();
	   miles=k/0.62137;
	   System.out.println("miles conversion is " +miles);
	}
}
