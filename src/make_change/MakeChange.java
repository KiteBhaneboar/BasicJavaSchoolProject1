package make_change;

import java.util.Scanner;

public class MakeChange 
{

	public static void main(String[] args) 
	{
		Scanner makeChange = new Scanner(System.in);
		
		double price, moneyReceived, priceCents, moneyReceivedCents, moneyReceivedDollars, changeDouble;
		int  priceDollars, change, dollars, quarters, dimes, nickels, pennies, remainingChangeDollars,remainingChangeQuarters, remainingChangeDimes, remainingChangeNickels;

		System.out.println("Please enter the price in $x.xx fromat: ");
		price = makeChange.nextDouble();
		System.out.println("Please enter the amount paid $x.xx format: ");
		moneyReceived = makeChange.nextDouble();
		
		changeDouble = moneyReceived - price;
		priceCents = price*100;
		moneyReceivedCents = moneyReceived*100;
		change = (int)moneyReceivedCents - (int)priceCents;
		
		System.out.println(change);
		dollars = change / 100;
		remainingChangeDollars = change % 100;
		quarters = remainingChangeDollars / 25;
		remainingChangeQuarters = remainingChangeDollars % 25;
		dimes = remainingChangeQuarters / 10;
		remainingChangeDimes = remainingChangeQuarters % 10;
		nickels = remainingChangeDimes / 5;
		remainingChangeNickels = remainingChangeDimes % 5;

		System.out.printf("Total change in dollars: $%5.2f\n", changeDouble);
		System.out.println("Total change in cents: " + change);
		System.out.println("Dollars: " + dollars);
		System.out.println("Quarters: " + quarters);
		System.out.println("Dimes: " + dimes);
		System.out.println("Nickels: " + nickels);
		System.out.println("Pennies: " + remainingChangeNickels);
		
		
		

	}

}
