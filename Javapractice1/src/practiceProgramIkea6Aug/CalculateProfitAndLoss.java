
//package practiceProgramIkea6Aug;
//
//public class CalculateProfitAndLoss {
//       static void calcProfitAndLoss(int cp, int sp){
//       int profit=0;
//       int loss=0;
//       if(sp>cp){
//          profit=sp-cp;
//       //static int  ==>>  //return profit;
//          System.out.println("The profit is: " +profit);
//       }
//       else if(cp>sp){
//          loss=cp-sp;
//       }
//         System.out.println("The loss is: " +loss);
//       //static int ==>>//return loss;
//}
//  public static void main(String[] args){
//     
//  
//}
//}



package practiceProgramIkea6Aug;
import java.util.Scanner;
public class CalculateProfitAndLoss {
       static  void calcProfitAndLoss(int cp, int sp){
       int profit=0;
       int loss=0;
       if(sp>cp){
          profit=sp-cp;
          System.out.println("the profit is: " +profit);
      
       }
       else if(cp>sp){
          loss=cp-sp;
          System.out.println("the loss is: "  +loss);
       }
	
      
}
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter cost price");
    int cp=sc.nextInt();
    System.out.println("Enter selling price");
    int sp=sc.nextInt();
    
	calcProfitAndLoss(cp, sp);
//	



}
}

