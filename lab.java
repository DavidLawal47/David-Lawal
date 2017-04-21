/*
 * David B. Lawal
 * Prof. Naidu
 * Class CSCI 1301 20867 Mon and Wed. 9:00 AM-1050 0021 224
Design a solution that requests and receives student names and an exam score for each.

The program should continue to accept names and scores until the user inputs a student whose name is “alldone”.
After the inputs are complete determine which student has the highest score and display that student’s name and score.
 
*/
package lab;

import java.util.Scanner;

public class lab {
	
	public static void main(String[] arg) 
	{
		Scanner input = new Scanner(System.in);
		
		String name = "";
	   
		String highName = "";
	  
		int highScore = 0;
		
		int score = 0;
		
		
		while(true)
		{
			
			System.out.println("Enter name of student or all done if finished");
		       
			name = input.nextLine();
			
			if((name.equals("all done")))
			{
				break;
			}
			else 
			{
				System.out.println("Enter Student score (must be a number or it will be 0)");
				
				String std_score = input.next();
				
				input.nextLine();
				
				// try to make what was score in std-SCORE IN NUMBER, if unambe to jy=ust set std-SCORE TO 0
				try
				{
					score = Integer.parseInt(std_score);
					
				}
				catch(NumberFormatException x)
				{
					score = 0;
				}
				
			} 
		
			if(score > highScore)
			{
				highScore = score;
				highName = name;
				
			}
			
			
		}
		System.out.printf("%s had the highest score, which was %d", highName, highScore);
	}
	
}
	 
		