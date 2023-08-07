package oops_practive.BloomingBank;

import java.util.Scanner;

public class MainBank {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("************************Welcome to Blooming Bank*************************");
		System.out.println("To use our services login to your account");
		//store some account 
		// add some customer accounts beforehand 
        // ask user `	to login or cfreate new account -----------------
       // create and call login function 
		
		System.out.println("Enter the account numbdr ");
	
		String accountNumber = sc.next();
		System.out.println("Enter the pin number ");
		String pinNumber = sc.next();
		// cge
		System.out.println("**************************");
		
		System.out.println("You are successfully logged in!");
		
		System.out.println("Select an option from below");

		Accounts ob = new Accounts();
	
		Account ac1 = new Account();

		int choice;
		do {
			ob.dispMenu();
			choice = sc.nextInt();
			switch (choice) {
			// Case
			case 1:
				ob.createAccount(ac1);
				Account ac2 = new Account();
				break;
			case 2:
				ob.depositMoney(ac1, 2000);
				break;
			case 3:
				ob.withDraw(ac1, 2000);
				break;
			case 4:
				ob.checkBalance(ac1);
				break;
			case 5:
				ob.logout();
				break;

			case 6:
				ob.showAllAccounts();
				break;

			default:
				System.out.println("invalid input please enter any number between 0 to 6");
			}
		} while (choice != 0);

	}
}
