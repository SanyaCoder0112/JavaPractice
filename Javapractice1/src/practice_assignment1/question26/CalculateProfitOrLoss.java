package practice_assignment1.question26;
import java.util.Scanner;
public class CalculateProfitOrLoss {
	//Write a program to calculate profit or loss. cp and sp provided by user.

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in) ;
		System.out.println("Enter the cp") ;
		int cp=sc.nextInt();
		System.out.println("Enter the sp");
		int sp=sc.nextInt() ;
		int profit=sp-cp;
		System.out.println(profit) ;
		int loss=cp-sp;
		System.out.println(loss) ;
	}
}
