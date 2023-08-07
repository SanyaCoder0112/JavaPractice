package practiceProgramIkea6Aug;

public class Print3_6_11_18_27_38 {
	public static void printingOddSum() {
		int sum=2;
		for(int i=1;i<=12;i++) {
			if(i%2==1) {
				sum=sum+i;
			
			System.out.println(sum);
			}
		}
		
	}
	public static void main(String[] args) {
		printingOddSum();
	}
	}
