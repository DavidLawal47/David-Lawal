/*
 * David B. Lawal
 * Prof. Naidu
 * Class CSCI 1301 20867 Mon and Wed. 9:00 AM-1050 0021 224
 * This program receives an ASCII code (an integer between 0 and 127) and displays its character.
 * <Output>

            Enter an ASCII code: 69 <enter>

            The character for ASCII code 69 is E
 * 
 */

package lab5point1;

import java.util.*;

public class Lab5point1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// prompts user to enter a ASCII code.
		System.out.println("Enter an ASCII code (an integer between 0 and 127):");
		
		int aSCIICode = scan.nextInt();
		
		//converts the ASCII code to the equivalent character.
		
		char displayCode = (char) aSCIICode;
		
		//display the results
		System.out.println("The character is " + displayCode);
		

	}

}
