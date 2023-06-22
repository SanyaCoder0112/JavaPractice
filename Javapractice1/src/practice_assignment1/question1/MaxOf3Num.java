package practice_assignment1.question1;

public class MaxOf3Num {
	public static void main(String[] args) {


		int a=3;
		int b=2;
		int c=8;
		if(a>b && b>c) {
			System.out.println(a);
		}
		else if(b>a && b>c) {
			System.out.println(b);
		}
		else {
			System.out.println(c);
		}
	}
}
