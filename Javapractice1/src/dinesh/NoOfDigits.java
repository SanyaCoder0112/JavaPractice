package dinesh;

import java.util.Scanner;

public class NoOfDigits {
	
	static int sum;

	public static String forMethod(int a) {
		int count = 0;
		for(int i= a; i> 0; i /= 10) {
			count++;
		}
		return ""+ count;
	}
	
	public static int method2(int a) {
		// ["6","6","7"]
		return (""+a).split("").length;
	}
	
	public static int method3(int a) {
		if(a == 0) {
			return 0;
		}
		return 1 + method3(a/10);
	}
	
	public static int reverse(int a) {
		
		if(a > 0) {
		     sum=sum*10+ a%10;
		     return reverse(a/10);
		}else {
		      return sum;
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int a = sc.nextInt();
		
		System.out.println("Received count from method1 " + forMethod(a));
		System.out.println("Received count from method2 " + method2(a));
		System.out.println("Received count from method3 " + method3(a));
		System.out.println("Reverse is " + reverse(a));
	}
}
