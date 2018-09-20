package com.globant.javaAssignment1;

public class HealthyBurger extends Hamburger{
	
	public HealthyBurger()
	{
		//this.setBread("brown bread");
		//this.setPrice(75);
		this.price=75;
		this.bread="brown bread";
		
	}
	
	public void twoExtraToppings()
	{
		System.out.println("You can choose 2 more special toppings available for healthy burger  ");
		System.out.println("Choose your additonal 2 toppings amongst these three options");
		int toppingChoice;
		int count=0;
		do 
		{
		    System.out.println("1.Cutlet 2.Cheese 3.Corn 4.No more toppings");
	        toppingChoice = sc.nextInt();
			
	        if(toppingChoice==1)
			{
	        	System.out.println("Cutlet worth Rs 30 added");
				price+=30;
				count++;
				toppings.add("Cutlet");
				
			}
			else if(toppingChoice==2)
			{
				System.out.println("Cheese worth Rs 25 added");
				price+=25;
				count++;
				toppings.add("Cheese");
				
			}
			else if(toppingChoice==3)
			{
				System.out.println("Corn worth Rs 20 added");
				price+=20;
				count++;
				toppings.add("Corn");
				
			}
			  if(count==2) // 2 items added
	        	break;
	        System.out.println("Choose from the remaining toppings or add extra of the same");
	        
		}while(toppingChoice!=4);
		
	}
	
	

}
