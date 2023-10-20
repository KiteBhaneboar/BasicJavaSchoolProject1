package jar;

import java.util.Scanner;

public class Jar {

	public static void main(String[] args) {
		int pennies, nickels, dimes, quarters, centsTotal;
		Scanner cents = new Scanner(System.in);
		
		// user input
		System.out.println("Please enter the amount of pennies in jar: ");
		pennies = cents.nextInt();
		System.out.println("Please enter the amount of nickels in jar: ");
		nickels = cents.nextInt();
		System.out.println("Please enter the amount of dimes in jar: ");
		dimes = cents.nextInt();
		System.out.println("Please enter the amount of quarters in jar: ");
		quarters = cents.nextInt();
		
		// calculation
		centsTotal = pennies + nickels*5 + dimes*10 + quarters*25;
		
		// print
		System.out.println("The jar contains " + centsTotal + " cents.");
	}

}
