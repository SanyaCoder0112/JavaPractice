package practiceProgramIkea6Aug;

public class RootsOfEquation {
//26.Wap to find all the roots of quadratic equation using a function
 public static double squareRoot(int a,int b,int c ) {
		double x;
		double z= (b*b- 4*a*c)/(2*a);
		x=Math.sqrt(z)-b;
		return x;
}

 public static void main(String[] arg) {
	 RootsOfEquation obj=new RootsOfEquation();
	
	 double rootAnswer=obj.squareRoot(3,7,1);
		System.out.println("The positive value of root of equation is: " +rootAnswer);

	 
 }


	// TODO Auto-generated method stub
	
}


//ax^2+2bx+c=0
//x=-b+((rootofb^2-4ac)/2a)