package com.globant.javaAssignment1;


import java.util.ArrayList;
import java.util.Scanner;

public class Hamburger {
	
		public Hamburger()
		{
			this.bread = "white";
			this.meat = "pork";
			this.price=50;
		}
	
		Scanner sc = new Scanner(System.in);
		
		protected String bread; // shared between parent and child classes(all protected)
		protected String meat;
		protected double price;
		protected ArrayList<String> toppings = new ArrayList<>();
		
		private int carrotPrice = 20;
		private int tomatoPrice = 20;
		private int lettucePrice = 30;
		private int olivesPrice = 30;
	
	
	public void updateBread()
	{
		System.out.println("Enter type of bread from 1.Italian or 2.Multi-grain");
		if(sc.nextInt()==1)
		{
			bread= "Italian";
		}
		
		else
		{
			bread = "Multi-grain";
		}
		
		
	}
	
	public void updateMeat()
	{
		System.out.println("Enter type of meat from 1.Chicken or 2.Pork");
		if(sc.nextInt()==1)
		{
			meat= "Chicken";
		}
		
		else
		{
			meat = "Pork";
		}
	}
	


	public void extra_toppings()
	{
		System.out.println("Choose your toppings amongst these four options");
		int toppingChoice;
		do 
		{
		    System.out.println("1.Olives 2.Tomatoes 3.Lettuce 4.Carrot 5.No more toppings");
	        toppingChoice = sc.nextInt();
			
	        if(toppingChoice==1)
			{
	        	System.out.println("Olives worth Rs 30 added");
				price+=olivesPrice;
				toppings.add("Olives");
			}
			else if(toppingChoice==2)
			{
				System.out.println("Tomatoes worth Rs 20 added");
				price+=tomatoPrice;
				toppings.add("Tomatoes");
			}
			else if(toppingChoice==3)
			{
				System.out.println("Lettuce worth Rs 30 added");
				price+=lettucePrice;
				toppings.add("Lettuce");
			}
			else if(toppingChoice==4)
			{
				System.out.println("Carrot worth Rs 20 added");
				price+=carrotPrice;
				toppings.add("Carrot");
			}
	       
	        
		}while(toppingChoice!=5);
		
	
	}
	
}
