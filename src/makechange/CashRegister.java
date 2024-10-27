package makechange;

import java.util.Scanner;

public class CashRegister {

	public static void main(String[]args) {
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Enter the price of the item: ");
		double price = kb.nextDouble();
		
		System.out.print("How much money was tendered: ");
		double moneyTendered = kb.nextDouble();
		
		if (moneyTendered < price) {
			System.out.println("Not so fast, you're a little short");
		}
		else if (moneyTendered == price) {
			System.out.println("You paid the exact amount");
		}
		else if (moneyTendered > price) {
			
			double change = moneyTendered - price;
			System.out.println("Change due: " + change);
			change = change * 100;
		
			int changeNew = (int)(change);
			System.out.println(changeNew);
			int quarters = changeNew / 25;
			System.out.println("q " + quarters);
			changeNew = changeNew % 25;
			System.out.println(changeNew);
		
			int dimes = changeNew / 10;
			System.out.println("d " + dimes);
			changeNew = changeNew % 10;
			System.out.println(changeNew);
		
			int nickels = changeNew /5;
			System.out.println("n " + nickels);
			changeNew = changeNew % 5;
			System.out.println(changeNew);
		
			int pennies = changeNew;
			System.out.println("p " + pennies);
		}
			
			
			
//			changeNew = changeNew % 100;
//			System.out.println(changeNew);
//			
//			int ten = changeNew;
//			int five = changeNew;
//			int one = changeNew;
			
//		if (moneyTendered > price) {
//			System.out.println(ten);
//			if (ten >= 1000 && ten <= 2000) {
//				System.out.println("Your change is " + 1 + " ten dollar bill");
//			}
//			
//			System.out.println(five);
//			if (five >= 500 &&  five < 1000 || five >= 1500 && five < 2000) {
//				System.out.println("Your change is " + 1 + " five dollar bill");
//			}
//			
//		
//		}
			
		kb.close();
	}
}