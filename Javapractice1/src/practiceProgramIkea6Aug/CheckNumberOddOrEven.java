package practiceProgramIkea6Aug;

public class CheckNumberOddOrEven {
	public static void oddEvenNumber(int num){
		if(num%2==0) {
			System.out.println("the number is even");
		}
		else if(num%2==1) {
			System.out.println("the number is odd");
		}
	}
	public static void main(String[] args) {
		oddEvenNumber(554);
	}

}
