/*
 * David B. Lawal
 * Prof. Naidu
 * Class CSCI 1301 20867 Mon and Wed. 9:00 AM-1050 0021 224
 * This program receives an character and displays its Unicode. Here is a sample run:

     <Output>

            Enter an character: E <enter>

            The Unicode for the character E is 69

     <End Output>
 * 
 */
package lab5point2;


import java.util.*;

public class Lab5point2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String input;
		
		char uni;
		
		System.out.println("Enter a character");
		
		input = scan.nextLine();
		uni = input.charAt(0);
		
		System.out.println("The unicode for the character " + uni + " is " + (int)uni + ".");

	}

}
