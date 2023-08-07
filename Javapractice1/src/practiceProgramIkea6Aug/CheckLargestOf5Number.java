package practiceProgramIkea6Aug;

public class CheckLargestOf5Number {
	public static void largestNumber(int a,int b,int c,int d,int e){
		if(a>b && a>c && a>d && a>e) {
			System.out.println("largest element is " +a);
			
		}
		else if(b>a && b>c &&b>d &&b>e) {
			System.out.println("largest element is " +b);
		
		}
		else if(c>a && c>b && c>d && c>e) {
			System.out.println("largest element is " +c);
		
		}
		else if(d>a && d>b && d>c && d>e) {	
			System.out.println("largest element is " +d);
			
		}
		else if(e>a&& e>b && e>c && e>d) {
			System.out.println("largest element is " +e);
			
		}
		
	}


    public static void main(String[] args){
    	largestNumber(1,2,3,4,5);
            
    }
}