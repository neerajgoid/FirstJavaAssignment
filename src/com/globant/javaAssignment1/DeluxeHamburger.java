package com.globant.javaAssignment1;

import java.util.Scanner;

public class DeluxeHamburger extends Hamburger{
	
	public DeluxeHamburger()
	{
		this.price=50;
	}
	int cokePrice = 25;
	int chipsPrice = 30;
	String chips_drinks;
	public String chipsAndDrinks()
	{
		System.out.println("Want do you want? 1. chips 2. drinks 3. both");
		Scanner scanner = new Scanner(System.in);
		int deluxe_choice = scanner.nextInt();
		if(deluxe_choice==1)
		{
			price+=chipsPrice;
			chips_drinks="Only Chips";
		}
		else if(deluxe_choice==2)
		{
			price+=cokePrice;
			chips_drinks="Only Drink";
		}
		else if(deluxe_choice==3)
		{
			price+=(chipsPrice+cokePrice);
			chips_drinks="Chips and Drink";
		}
		return chips_drinks;
	}
}
