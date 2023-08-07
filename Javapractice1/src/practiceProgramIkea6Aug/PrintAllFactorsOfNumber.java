package practiceProgramIkea6Aug;

public class PrintAllFactorsOfNumber {
	public static void factors(int num) {
		int factor=1;
		for(int i=0;i<num;i++) {
			if(num%i==0) {
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		factors(20);
	}

}
