package practice_assignment1.question12;

import java.util.Scanner;

public class DiscountOf10Percent {
	// Take values of length and breadth of a rectangle from user and check if it is
	// square or not.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int CostOfProduct = 100;
		System.out.println("Enter quantity of product bought");
		int quantity = sc.nextInt();
		Double TotalPurchasedCost = (double) (quantity * CostOfProduct);
		System.out.println("Cost before discount: " + TotalPurchasedCost);
		if (TotalPurchasedCost > 1000) {
			TotalPurchasedCost = TotalPurchasedCost * 0.9;
			System.out.println("After applying dicount: " + TotalPurchasedCost);
		} else {
			System.out.println("No discount would be applied");
		}

	}
}