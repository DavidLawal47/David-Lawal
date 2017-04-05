/*
 * David B. Lawal
 * Prof. Naidu
 * Class CSCI 1301 20867 Mon and Wed. 9:00 AM-1050 0021 224
 * This program simulates a rock, paper, sissors, game between the user and the computer
 */

package lab6point3;

import java.util.*;

public class Lab6point3 {

	public static void main(String[] args) {
		
		boolean repeat = true;
		 
		int correct = 0;
		  
		int incorrect = 0;
		  
		do{
			Scanner scan = new Scanner(System.in);  // create object for input
		  
			System.out.println(" add(1), subtract(2), multiply(3), divide(4), quit(5)"); 
		  
		  int correctAnswer = 0;
		  
		  int userResponse = scan.nextInt();
		  
		  String strGuess = "";
		 
		  switch (userResponse) {
		  
		  case 1:
		  
			  strGuess = "add";
		   
			  break;
		  
		  case 2:
		  
			  strGuess = "subtract";
		   
			  break;
		  
		  case 3 :
		  
			  strGuess = "multiply";
		   
			  break;
		   
		  
		  case 4:
			
			  strGuess = "divide";
			  
			  break;
	
			  // ends the entire simulation a default button   
			  
		  case 5:
			
			  repeat = false;
		  
		  default:
		  
			  System.out.println("Hope you were able to learn something today");
		   
			  System.exit(0);
		  }
		 // 1. generate 2 random numbers ( 1-10)
		  
		  int n1 = (int)(10 * Math.random() + 1);
		  
		  int n2 = (int)(10 * Math.random() + 1);
		  
		  // 2. Generate a random operator ( 1 - 4)
		  
		  //    (  1 is Add , 2 is subtract, 3 is multiply, 4 is integer divide )
		  
		  //int operator = (int)(1 * Math.random() + 1);
		  
		  // 3. depending on operator, calculate  the correct answer
		  
		  //and display the problem using the proper operator 
		  
		  if  (userResponse == 1){       
		    	 // add       
		  
			  correctAnswer = n1 + n2;
		    	
			  System.out.println("What is " + n1 +    " + "    + n2  + " ?");
		  
		      
		  } else if ( userResponse == 2 ){      // subtract	  
		  
			  correctAnswer = n1 - n2;
		  
		      
			  System.out.println("What is " + n1 +    " - "   + n2 + " ?");
		  
		      
		  }  else if ( userResponse == 3) {  // multiply
		  
		  
			  correctAnswer = n1 * n2;
		  
			  
		              System.out.println("What is " + n1 +    " * "   + n2 + " ?");
		  
		      
		  }   else if ( userResponse == 4){    // divide
		  
		               correctAnswer = n1 / n2;
		  
		              System.out.println("What is " + n1 +    " / "   + n2 + " ?");
		  
		          }          
		  
		  if (userResponse == 5)
		  
		  {
		  
			  System.out.println("Hope you were able to lean something today.");
		    	
			  break;
		    	 
		     }
		     		
		    
		  // 4. input the user's response to this problem
		  
		  userResponse = scan.nextInt();
		  
		  //scan.close();
		  
		  
		  // 5. compare user's answer to correct answer
		  
		  if (userResponse == correctAnswer){
		  
		  
			  System.out.println("Yay! that is correct, good job");
		      
			  correct++;
		      
		  } else
			  
			  {
			  
			  System.out.println("Sorry but the correct answer is: " + correctAnswer + " Try again");
		      
			  incorrect++;
		                 
		              }
		  
		      
		  System.out.println("Number of correct answers :" + correct);
		  
		  System.out.println("Number of incorrect answers :" + incorrect);
		  
		}            
		
		while(true);
		      }
}


