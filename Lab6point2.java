/*
 * David B. Lawal
 * Prof. Naidu
 * Class CSCI 1301 20867 Mon and Wed. 9:00 AM-1050 0021 224
 * Write a program that plays the popular scissor-rock-paper game. 
 * (A scissor can cut a paper, a rock can knock a scissor, and a paper can wrap a rock.) 
 * The program randomly generates a number 0, 1, or 2 representing scissor, rock, and paper.
 *  The program prompts the user to enter a number 0, 1, or 2 
 * and displays a message indicating whether the user or the computer wins, loses, or draws
 */
package lab6point2;

import java.util.*;

public final class Lab6point2 {

	public static void main(String[] args) {
		
			
		int count = 0;
		
		int userWins = 0;
		
		int computerWins = 0;
		
		int draw = 0;
		
		boolean repeat = true;
		do{
			Scanner scan = new Scanner(System.in);
		 
			System.out.println("Welcome to the Rock, Paper, Sissors Simulator, here are your options ");
		  
			System.out.println(" ==> scissor (0), rock (1), paper (2), quit (3) <== : ");
		  
			int userResponse = scan.nextInt();
		  
			int computer = (int) (Math.random() * 3);
			
			
		  
			String strComputer = "";
		
			// switch cases, if the user inputs the following values 
		  
			switch (computer) {
		  
			case 0:
		   
				strComputer = "scissor";
		   
				break;
		  
			case 1:
		   
				strComputer = "rock";
		   
				break;
		  
			case 2:
		   
				strComputer = "paper";
		   
				break;
		  
			}
		
			// a switch case that acts as a computer "guess" but the outcome are predetermined" 
		  
			String strGuess = "";
		
		
			switch (userResponse) {
		  
		 
			case 0:
		  
			
				strGuess = "scissor";
		   
				break;
		
		  
			case 1:
		 
			
				strGuess = "rock";
		 
			  
				break;
		 
		  
			case 2:
		  
			
				strGuess = "paper";
		  
			  
				break;
		
				// ends the entire simulation a default button   
		  
			case 3:
			
			  repeat = false;
		  
		  
			default:
		  
			  System.out.println("Thanks for Playing.");
		 
			  System.exit(0);
		  }
		 
		  System.out.print("The computer is " + strComputer + ". You are "
		  
				  + strGuess);
		 // if the user inputs a certain value an action will take place
		  if (computer == userResponse) {
		 
			
			  System.out.println(" too. It is a draw");
			  
			  draw++;
			  
			  count++;
		 
		  } else if (computer - userResponse == 1 || computer - userResponse == -2) {
		  
			  
			  System.out.println(". Computer won.");
			  
			  computerWins++;
			  
			  count++;
		  
		  } else if (computer - userResponse == -1 || computer - userResponse == 2) {
		  
			  
			  System.out.println(". You won.");
			  
			  userWins++;
			  count++;
			  
		  }
		  
		  System.out.println("User : wins " + userWins);
		  
		  System.out.println("computer: Wins " + computerWins);
		 
		  System.out.println("Draw " + draw);
		
		}
		
		while(true);
		 
		}
}

		



