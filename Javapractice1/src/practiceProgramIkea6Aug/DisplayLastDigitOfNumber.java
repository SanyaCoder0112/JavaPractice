package practiceProgramIkea6Aug;
  public class DisplayLastDigitOfNumber{
        public static int lastDigit(int num){
        int rem=0;
        if(num!=0){
             rem=num%10;
        
        return rem;
        }
        else{
        return 0;
}
}
   public static void main(String[] args){
      int enddigit=lastDigit(87653);
      System.out.println("the last digit is: " +enddigit);
   }
}
  