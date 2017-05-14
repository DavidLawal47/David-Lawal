/*
 * David B. Lawal
 * Prof. Naidu
 * Class CSCI 1301 20867 Mon and Wed. 9:00 AM-1050 0021 224
 * This program prompts the user to enter a four binary numbers as a string and displays its corresponding decimal value. Here are sample runs:

      <Output>

Enter a four-digit binary string: 1111 <enter>

The decimal number for 1111 is 15

      <End Output>

 

     <Output>

Enter a four-digit binary string: 0100 <enter>

     The decimal number for 0100 is 4

     <End Output>
 */
package lab5point4;

import java.util.*;

public class Lab5point4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a binary number");
		
		String binaryString = scan.nextLine();
		
		System.out.println("Result " + Integer.parseInt(binaryString,2));
		

	}

}
