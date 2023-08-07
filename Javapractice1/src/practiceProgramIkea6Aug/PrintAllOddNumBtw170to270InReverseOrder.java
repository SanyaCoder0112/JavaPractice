package practiceProgramIkea6Aug;

public class PrintAllOddNumBtw170to270InReverseOrder {
	 public static void oddNumRev(){
       for(int i=270;i>=170;i--){
         if(i%2==1 ){
         System.out.println(i);
}
        
}
	 }
	public static void main(String[] args){
      
        System.out.println("the odd num between 170 an 270 are : " );
        oddNumRev();
}
}
