/*
 * David B. Lawal
 * Prof. Naidu
 * Class CSCI 1301 20867 Mon and Wed. 9:00 AM-1050 0021 224
 * This program is a simulation that takes 3 numbers and add them all together. ex 999 = 27
 * Write a program that will accurately determine a bill.

Programs must be tested.  In order to test this program, use the following scenario.

A family stops at the restaurant for lunch.  The family is composed of a middle aged mother and father named Bill and Nancy.  They have a 2-year old child named Jesse.  They are traveling with Nancy's elderly grandmother, Sarah. 

Everybody decided to order a burger.  Nancy and Jesse order a soft drink.  Nancy and Sarah order soup.  Bill orders 5 wings.  Bill and Sarah order coffee.  Jesse orders ice cream.

Run your program one time for each person and determine the grand total this family would owe on their bill.
 */


package lab9Arrays;


import java.util.*;

public class Lab9Arrays {
	
	public static void main(String[] args) {
		
		String[] menuItems;
		
		double[] itemPrice;
		
		//int [] total;
		
		//int numOfPeople ;
		
		//int discountType;
		
		//int numOfAdults;
		
		//int numOfTeens;
		
		//int numOfSeniors;
		
		//int numOfTodlers;
		
		
		menuItems = new String[9];
		
		itemPrice = new double[9];
		
		//total = new int[10];
		//Parallel array that will display the menu
		menuItems[0] = "Soup";
		menuItems[1] = "Wings";
		menuItems[2] = "Burger";
		menuItems[3] = "Chicken sandwitch";
		menuItems[4] = "Fries";
		menuItems[5] = "Pie";
		menuItems[6] = "Ice Cream";
		menuItems[7] = "Soft Drink";
		menuItems[8] = "Cofee";	
		
		//itemPrice[0] = 
		itemPrice[0] = 2.50;
		itemPrice[1] = 0.15;
		itemPrice[2] = 4.95;
		itemPrice[3] = 5.95;
		itemPrice[4] = 1.99;
	    itemPrice[5] = 2.95;
		itemPrice[6] = 2.99;
		itemPrice[7] = 1.50;
		itemPrice[8] = 1.00;
		
		//dispalys the menu in a straight row 
		System.out.println("Here are our delicious menu that will leave you satisfied: " + "\n");
		int twoDim[][] = new int [1][2];
		
		int i;
		
		int j;
		
		int k = 1;
		
		for(i = 0; i< 1; i++){
		
			for(j = 0; j< 1; j++){
			
				twoDim[i][j]= k;
				
				k++;
				

		}
		
		for(int[] row : twoDim){
			//displays the menu 
			System.out.print(Arrays.toString(menuItems) + "\n" + " " + "$" + Arrays.toString(itemPrice));
			
			//System.out.println(Arrays.toString(itemPrice));
		} 
		
		
		
		//System.out.println(Arrays.toString(menuItems));	
		//System.out.println("$ " + Arrays.toString(itemPrice) );
		
		// allows user inputs
		Scanner scan = new Scanner(System.in);
		
		//Displays the discounts
		System.out.println( "\n" + "Here are the discounts:");
				
		System.out.println("==>KIDS UNDER THE AGE OF 5, EAT FREE!!!<==");
		System.out.println("==>TEENS AND SENIORS GET A 25% DISCOUNT.<==");
		System.out.println("==>NO TAX FOR ANYTHING A SENIOR OR TEAN ORDERS.<==" + "\n");
		
	
		       Scanner input = new Scanner(System.in);
		       int numOfPeople1;
		       int age;
		       int soup;
		       int wings;
		       int burger;
		       int chickensandwich;
		       int fries;
		       int pie;
		       int icecream;
		       int softdrink;
		       int cofee;
		       int count;
		       int more = 0;
		      
		       do
		       {      
		    	   double grandTotal = 0;
		           System.out.print("Number of persons: ");
		           numOfPeople1 = input.nextInt();      
		          
		           Restaurant[] orders = new Restaurant[numOfPeople1];
		          
		           System.out.println("Every person who eats at this restaurant orders exactly three items. Never greater, never fewer.");
		           
		           //For loop that allows the user to iput the correspondingnumber of orders the customer ordered. Also the loop is set to three items only
		           for(int a = 0; a < numOfPeople1; a++)
		           {
		               soup = 0;
		               wings = 0;
		               burger = 0;
		               chickensandwich = 0;
		               fries = 0;
		               pie = 0;
		               icecream = 0;
		               softdrink = 0;
		               cofee = 0;
		               count = 0;
		               System.out.println("Enter order for person " + (i + 1) + ":");
		              
		               System.out.print("Age: ");
		               age = input.nextInt();
		              
		               System.out.print("Soup: ");
		               soup = input.nextInt();
		              
		               if(soup > 0)
		                   count++;
		              
		               System.out.print("Wings: ");
		               wings = input.nextInt();
		              
		               if(wings > 0)
		                   count++;
		              
		               System.out.print("Burger: ");
		               burger = input.nextInt();
		              
		               if(wings > 0)
		                   count++;
		              
		               if(count == 3)
		               {
		                   System.out.println("You ordered three items. Thank you.");              
		                  // orders[i] = new Restaurant();
		                   System.out.print( i + 1);
			               grandTotal = (grandTotal + orders[i].getTotalbill());
		               }
		               else
		               {          
		                   System.out.print("Chickensandwich: ");
		                   chickensandwich = input.nextInt();
		                  
		                   if(chickensandwich > 0)
		                       count++;
		                  
		                   if(count == 3)
		                   {
		                       System.out.println("You ordered three items. Thank you.");              
		                       //orders[i] = new Restaurant(age, soup, wings, burger, chickensandwich, fries, pie, icecream, softdrink, cofee);
		                       System.out.print( i + 1);
				               grandTotal = (grandTotal + orders[i].getTotalbill());
		                   }
		                   else
		                   {
		                       System.out.print("Fries: ");
		                       fries = input.nextInt();
		                      
		                       if(fries > 0)
		                           count++;
		                      
		                       if(count == 3)
		                       {
		                           System.out.println("You ordered three items. Thank you.");              
		                           //orders[i] = new Restaurant(age, soup, wings, burger, chickensandwich, fries, pie, icecream, softdrink, cofee);
		                           System.out.print( i + 1);
		    		               grandTotal = (grandTotal + orders[i].getTotalbill());
		                       }
		                       else
		                       {                  
		                           System.out.print("Pie: ");
		                           pie = input.nextInt();
		                          
		                           if(pie > 0)
		                               count++;
		                          
		                           if(count == 3)
		                           {
		                               System.out.println("You ordered three items. Thank you.");              
		                             // orders[i] = new Restaurant(age, soup, wings, burger, chickensandwich, fries, pie, icecream, softdrink, cofee);
		                               System.out.print( i + 1);
		        		               grandTotal = (grandTotal + orders[i].getTotalbill());
		                           }
		                           else
		                           {                          
		                               System.out.print("Icecream: ");
		                               icecream = input.nextInt();
		                              
		                               if(icecream > 0)
		                                   count++;
		                              
		                               if(count == 3)
		                               {
		                                   System.out.println("You ordered three items. Thank you.");              
		                                  // orders[i] = new Restaurant(age, soup, wings, burger, chickensandwich, fries, pie, icecream, softdrink, cofee);
		                                   System.out.print( i + 1);
		            		               grandTotal = (grandTotal + orders[i].getTotalbill());
		                               }
		                               else
		                               {                              
		                                   System.out.print("Softdrink: ");
		                                   softdrink = input.nextInt();
		                                  
		                                   if(softdrink > 0)
		                                       count++;
		                                  
		                                   if(count == 3)
		                                   {
		                                       System.out.println("You ordered three items. Thank you.");              
		                                       //orders[i] = new Restaurant(age, soup, wings, burger, chickensandwich, fries, pie, icecream, softdrink, cofee);
		                                       System.out.print( i + 1);
		                		               grandTotal = (grandTotal + orders[i].getTotalbill());
		                                   }
		                                   else
		                                   {                                  
		                                       System.out.print("Cofee: ");
		                                       cofee = input.nextInt();
		                                      
		                                       if(cofee > 0)
		                                           count++;
		                                      
		                                       if(count == 3)
		                                       {
		                                           System.out.println("You ordered three items. Thank you.");              
		                                           for(int x = 0; x < numOfPeople1; x++)
		                        		           {          
		                        		               System.out.print( i + 1);
		                        		               grandTotal = (grandTotal + orders[i].getTotalbill());
		                        		           }  
		                                           // orders[i] = new Restaurant(age, soup, wings, burger, chickensandwich, fries, pie, icecream, softdrink, cofee);
		                                       }
		                                       else
		                                       {
		                                           System.out.println("You ordered less than three items. Give the order again.");
		                                          
		                                       }
		                                   }
		                               }
		                           }
		                       }
		                   }
		               }          
		           }
		          // Displays the total price of the bill
		           System.out.printf( "PERSON#" + " ",  "TOTALBILL");
		           //System.out.printf( "PERSON#", orders[i].getAge(), orders[i].getTotalbill());
		          // double grandTotal = 0;
		           for(int x = 0; x < numOfPeople1; x++)
		           {          
		               System.out.print( i + 1);
		               grandTotal = (grandTotal + orders[i].getTotalbill());
		           }  
		           System.out.println( grandTotal);  
		       }while(true);
		}
	}
}
