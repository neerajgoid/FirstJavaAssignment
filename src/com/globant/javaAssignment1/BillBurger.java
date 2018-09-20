package com.globant.javaAssignment1;

import java.util.Scanner;

public class BillBurger {
	
	static String chipsDrink; 

	public static void bill(Hamburger hamburger,int burger_choice)
	{
		System.out.println("**********BILLY BURGERS BILL**************");
		
		if(burger_choice==1)
			System.out.println("Burger type :" + "Regular");
		else if(burger_choice==2)
			System.out.println("Burger type :" + "Healthy");
		else 
			{
			System.out.println("Burger type :" + "Deluxe");
				System.out.println("Extra item taken:" + chipsDrink);
			}
		
		System.out.println("Bread chosen is :" + hamburger.bread);
		System.out.println("Meat chosen is :" + hamburger.meat);
		System.out.println("Number of Ingredients:" + hamburger.toppings.size());
		System.out.println("Ingredients added are " + hamburger.toppings);
		System.out.println("Total Price is :" + hamburger.price);
		System.out.println("****************THANK YOU FOR COMING**********");
	}
	
	public static void main(String[] args) {           // Starts execution from here
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome to Bill Burgers");
		System.out.println("Please enter your choice of burger");
		System.out.println("1.Regular 2.Healthy 3.Deluxe");
		
		int choice = scanner.nextInt();
		
		if(choice == 1) // For regular burger
		{
			Hamburger hamburger = new Hamburger();
			
		
			
			System.out.println("Type chosen is Regular Hamburger"); // General Information of choice taken
			System.out.println("Bread is: White");
			System.out.println("Meat is:Pork");
			System.out.println("Base price is:50");
			System.out.println("Do you want to update the defaults? 1.yes 2.no"); // choice to update default burger ingredients
			
			int defaultChoice= scanner.nextInt();
			
			if(defaultChoice==1)
			{
			    hamburger.updateBread();
			    hamburger.updateMeat();
			}
				
				hamburger.extra_toppings();
				bill(hamburger,1);
			
		}
		if (choice ==2)
		{
			HealthyBurger healthyBurger = new HealthyBurger(); // change to super class and see
			
			System.out.println("Type chosen is Healthy Hamburger");
			System.out.println("Bread is: Brown");
			System.out.println("Meat is:Pork");
			System.out.println("Base price is:75(25 extra for brown bread)");
			System.out.println("Do you want to change the meat? 1.yes 2.no");
			
			int defaultChoice= scanner.nextInt();
			
			if(defaultChoice==1)
			{
			   // healthyBurger.updateBread();
			    healthyBurger.updateMeat();
			}
				
				healthyBurger.extra_toppings();
				healthyBurger.twoExtraToppings();
				bill(healthyBurger,2);
			
		}
		
		if (choice ==3)
		{
			
			DeluxeHamburger deluxeHamburger = new DeluxeHamburger();
			System.out.println("Type chosen is Deluxe Hamburger");
			System.out.println("Bread is: White");
			System.out.println("Meat is:Pork");
			System.out.println("Base price is:50");
			System.out.println("Do you want to update the defaults? 1.yes 2.no");
			
			int defaultChoice= scanner.nextInt();
			
			if(defaultChoice==1)
			{
			    deluxeHamburger.updateBread();
			    deluxeHamburger.updateMeat();
			}
			System.out.println("Do you want to add the basic 4 toppings or just what comes with deluxe(chips and coke)?");
			System.out.println("1.Yes 2.No");
			if(scanner.nextInt()==1)
			{
				deluxeHamburger.extra_toppings();
			}
				chipsDrink = deluxeHamburger.chipsAndDrinks();
			
			bill(deluxeHamburger,3);
			
		}
		
	}
	
	
	

}
