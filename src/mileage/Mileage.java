package mileage;

import java.util.Scanner;

public class Mileage 
{
	public static void main(String[] args) 
	{
		Scanner mileageCalc = new Scanner(System.in);
		double gasConsumed, distance, mpg;

		System.out.println("Please enter the amount of gas (in gallons) your consumed: ");
		gasConsumed = mileageCalc.nextDouble();
		System.out.println("Please enter the distance 9in miles) you drove: ");
		distance = mileageCalc.nextDouble();
		
		mpg = distance/gasConsumed;
		
		System.out.printf("Your car's MPG is: %6.2f", mpg);
	}

}
