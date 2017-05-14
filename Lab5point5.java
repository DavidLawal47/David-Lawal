/*
 * David B. Lawal
 * Prof. Naidu
 * Class CSCI 1301 20867 Mon and Wed. 9:00 AM-1050 0021 224
 * This program prompts the user to enter a string (may contain spaces) and displays its last character.

      <Output>

Enter s string: Programming is fun <enter icon>

The last character is n

      <End Output>
 */

package lab5point5;

import java.util.*;

public class Lab5point5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String usrInputValue;
		
		System.out.println("Enter a sentence or word");
		
		usrInputValue = scan.nextLine();
		
		System.out.println("The last character is: " +usrInputValue.substring(usrInputValue.length()-1));

	}

}
