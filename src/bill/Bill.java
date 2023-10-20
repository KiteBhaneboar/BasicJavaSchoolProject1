package bill;

import java.text.NumberFormat;
import java.util.Scanner;

public class Bill 
{
	public static void main(String[] args) 
	{
		Scanner food = new Scanner(System.in);
		
		String dishOne,dishTwo, dishThree, dish, quantity, price, stringTotal;
		int quantityOne, quantityTwo, quantityThree;
		double priceOne, priceTwo, priceThree, totalOne, totalTwo, totalThree, subtotal, tax, tip, total;
		

		dish = "Dish";
		quantity = "Quantity";
		price = "Price";
		stringTotal = "Total";
		
		// dish one
		System.out.println("Please enter the name of dish one:");
		dishOne = food.nextLine();
		System.out.println("Please enter the quantity of dish one:");
		quantityOne = food.nextInt();
		System.out.println("Please enter the price of dish one:");
		priceOne = food.nextDouble();
		
		// dish two
		System.out.println("Please enter the name of dish two:");
		food.nextLine();
		dishTwo = food.nextLine();
		System.out.println("Please enter the quantity of dish two:");
		quantityTwo = food.nextInt();
		System.out.println("Please enter the price of dish two:");
		priceTwo = food.nextDouble();
		
		// dish three
		System.out.println("Please enter the name of dish three:");
		food.nextLine();
		dishThree = food.nextLine();
		System.out.println("Please enter the quantity of dish three:");
		quantityThree = food.nextInt();
		System.out.println("Please enter the price of dish three:");
		priceThree = food.nextDouble();
		
		// prices with multiple dishes
		totalOne = quantityOne * priceOne;
		totalTwo = quantityTwo * priceTwo;
		totalThree = quantityThree * priceThree;
		
		// subtotal, tax, tip, total
		subtotal = quantityOne*priceOne + quantityTwo*priceTwo + quantityThree*priceThree;
		tax = subtotal * .06;
		tip = subtotal * .18;
		total = subtotal + tax + tip;
		
		// printing values
		System.out.println("Your Bill: ");
		System.out.printf("%-30s %-10s %-4s %-2.5s\n", dish, quantity, price, stringTotal);
		System.out.printf("%-30s %-10d %-5.2f %-10.2f\n", dishOne, quantityOne, priceOne, totalOne);
		System.out.printf("%-30s %-10d %-5.2f %-10.2f\n", dishTwo, quantityTwo, priceTwo, totalTwo);
		System.out.printf("%-30s %-10d %-5.2f %-10.2f\n", dishThree, quantityThree, priceThree, totalThree);
		
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		System.out.printf("Subtotal: %27s\n", nf.format(subtotal));
		System.out.printf("18%% tip (before tax): %14s\n", nf.format(tip));
		System.out.printf("6%% sales tax: %22s\n", nf.format(tax));
		System.out.printf("Total: %30s\n", nf.format(total));
		
		food.close();
		
	}
}
