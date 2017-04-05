/*
 * David B. Lawal
 * Prof. Naidu
 * Class CSCI 1301 20867 Mon and Wed. 9:00 AM-1050 0021 224
 * 6-1 (Sum a Series) Write a program to sum the following series: (Programming Exercise 5.24)
 *  1/3 + 3/5 + 5/7 + 7/9 + 9/11 + 11/13 + . . . + 95/97 + 97/99
 * 
 */
package lab6point1;

public class Lab6point1 {

	public static void main(String[] args) {
		
		/*int sum = 0;
		int x = 0;
		
		for(int i= 1; i< 97; i += 2)
		{
			sum+= (int)i/(i+2);
		}
		System.out.println("The sum of all the numbers are " + sum);
		}
		problem was the trying to pass the integer through instead 
		of using a double
		since i'm dealing with fractions
   */ 
		
		double sum=0;
		for (int i=1; i<=97;i+=2)
		{
		sum+=(double)i/(i+2);
		}
		System.out.println("The sum of all the number are " + sum);
	}
}
	

        
	
	    
	



