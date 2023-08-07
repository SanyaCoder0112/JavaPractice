package practiceProgramIkea6Aug;

public class FactorialOfNumber {
	public static int factorialOfANum(int num) {
		int factorial = 1;
		for(int i=num-1;i>0;i--) {
			factorial=factorial*num*i;
			System.out.println(factorial);
			}
		return factorial;
	}
	public static void main(String[] args) {
		int findingfactorial=factorialOfANum(4);
		System.out.println(findingfactorial);
	}

}
