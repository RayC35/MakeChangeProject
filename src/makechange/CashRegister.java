package makechange;

import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		System.out.print("Enter the price of the item: ");
		double price = kb.nextDouble();

		System.out.print("How much money was tendered: ");
		double moneyTendered = kb.nextDouble();

		if (moneyTendered < price) {
			System.out.println("Not so fast, you're a little short pal.");
		} else if (moneyTendered == price) {
			System.out.println("You paid the exact amount!");
		} else if (moneyTendered > price) {

			double change = moneyTendered - price;
			System.out.println("Change due: $" + change);
			int changeNew = (int) (change * 100);
//			System.out.println(changeNew);

			int twenties = changeNew / 2000;
//			System.out.println(" twenty " + twenties);
			changeNew = changeNew % 2000;
//			System.out.println(changeNew);

			int tens = changeNew / 1000;
//			System.out.println("ten " + tens);
			changeNew = changeNew % 1000;
//			System.out.println(changeNew);

			int fives = changeNew / 500;
//			System.out.println("five " + fives);
			changeNew = changeNew % 500;
//			System.out.println(changeNew);

			int ones = changeNew / 100;
//			System.out.println("one " + ones);
			changeNew = changeNew % 100;
//			System.out.println(changeNew);

			int quarters = changeNew / 25;
//			System.out.println("q " + quarters);
			changeNew = changeNew % 25;
//			System.out.println(changeNew);

			int dimes = changeNew / 10;
//			System.out.println("d " + dimes);
			changeNew = changeNew % 10;
//			System.out.println(changeNew);

			int nickels = changeNew / 5;
//			System.out.println("n " + nickels);
			changeNew = changeNew % 5;
//			System.out.println(changeNew);

			int pennies = changeNew;
			
			System.out.print("Result: ");
			
			if (twenties == 1) {
				System.out.print(twenties + " twenty dollar bill, ");
			}
			else if (twenties > 1 && twenties < 5) {
				System.out.print(twenties + " twenty dollar bills, ");
			}
			
			
			if (tens != 0) {
				System.out.print(tens + " ten dollar bill, ");
			}
			
			
			if (fives != 0) {
				System.out.print(fives + " five dollar bill, ");
			}
			
			
			if (ones == 1) {
				System.out.print(ones + " one dollar bill, ");
			}
			else if (ones > 1 && ones < 5) {
				System.out.print(ones + " one dollar bills, ");
			}
			
			
			if (quarters == 1) {
				System.out.print(quarters + " quarter, ");
			}
			else if (quarters > 1 && quarters < 4) {
				System.out.print(quarters + " quarters, ");
			}
			
			
			if (dimes == 1) {
				System.out.print(dimes + " dime, ");
			}
			else if (dimes > 1 && dimes < 5) {
				System.out.print(dimes + " dimes, ");
			}
			
			
			if (nickels != 0) {
				System.out.print(nickels + " nickel, ");
			}
			
			
			if (pennies == 1) {
				System.out.print(pennies + " penny. ");
			}
			else if (pennies > 2 && pennies < 5); {
				System.out.print(pennies + " pennies. ");
			}
			
			
//			System.out.println("p " + pennies);
//			System.out.println("You get back " + twenties + " twenty dollar bill(s) " + tens + " ten dollar bill "
//					+ fives + " five dollar bill " + ones + " one dollar bill(s) " + quarters + "quarter(s) " + dimes
//					+ " dime(s) " + nickels + " nickel " + pennies + " pennies ");
		}

		kb.close();
	}
}