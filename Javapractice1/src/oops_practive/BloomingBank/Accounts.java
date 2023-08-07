package oops_practive.BloomingBank;

import java.util.Scanner;

import oops_practive.librarySystemDuplicate.book;

public class Accounts {
	
	// arraylist for array 
	
	Account theAccounts[] = new Account[500];
	//  
	public static int count;
   // it will be created at start of the code
	//and it's value will be 1 after first time  and its value will be 1 
	Scanner sc = new Scanner(System.in);
	 
//method 1
	
	 public void createAccount(Account ac1)
	 {
		 if (count < 50) {

	         theAccounts[count] = ac1;
	         count++;	 
		 }
		 
	 }
		 //method 2
		 
		 public void depositMoney(Account ac1,double depositedMoney) {
				ac1.balance += depositedMoney;
				System.out.println("Deposit is Succcessful, new Balance is " + ac1.balance);
			}
			public void withDraw(Account ac1, double withDrawalMoney) {
				if (ac1.balance - withDrawalMoney < 0) {
					System.out.println("WithDraw Unsuccessful only " + ac1.balance + " is left");
				} else {
					ac1.balance -= withDrawalMoney;
					System.out.println("WithDraw successful, Current Balance is " + ac1.balance);
				}
			}
			
			//method 4 balance checking
		    public void checkBalance(Account ac) {
		    	System.out.println("The balance is: " +ac. balance);
		    }
		    
			//method 5
			//show account details
			public void showAllAccounts()
			 {

			     System.out.println("\t\t\t\tSHOWING ALL ACCOUNTS\n");
			     System.out.println(
			         "name\t\taccountNumber\t\taccountType\t\tphoneNumber\t\tbalance\t\temail");
			     for (int i = 0; i < count; i++) {
			         System.out.println(
			             theAccounts[i].name + "\t\t"
			             + theAccounts[i].accountNumber + "\t\t"
			             + theAccounts[i].accountType + "\t\t"
			             + theAccounts[i].phoneNumber + "\t\t"
			             + theAccounts[i].balance + "\t\t"
			             + theAccounts[i].email);
			     }
			 }
			
			//method6  changePin 
			public void changePin()
			 {
			     System.out.println(
			         "\t\t\t\tCHANGE THE PIN NUMBER\n");
			     System.out.println("Enter current pin number" );
			     String curPinNo=sc.next();
			     String pinNumber = null;
				if(curPinNo==pinNumber) {
			    	 System.out.println("Enter new pin number");
			    	 pinNumber = sc.next();
			    	 System.out.println("Re-enter new pin number to confirm");
			    	 pinNumber = sc.next();
			    	 
			     } 	 
			     }

			 //method 7 logout 
			
			public void logout() {
				 System.out.println("Logout Successful");
				 System.out.println("Thank you for using BloomingBank");
				 System.out.println("Hope you are satisfied with our service");
			}
			
			 public void dispMenu()
			    {
			        System.out.println(
			      "----------------------------------------------------------------------------------------------------------");
			        System.out.println("Press 1 to create account ");

			        System.out.println("Press 2 to Deposit.");
			        System.out.println("Press 0 to Logout.");
			        System.out.println(
			            "Press 3 to Withdrawl.");
			        System.out.println("Press 4 to Check Balance.");
			        System.out.println("Press 5 to Show Profile or Account details");
			        System.out.println("Press 6 to change PIN");

			        System.out.println(
			            "-------------------------------------------------------------------------------------------------------");
			   
			    }
			
}
