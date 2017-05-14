/*
 * David B. Lawal
 * Prof. Naidu
 * Class CSCI 1301 20867 Mon and Wed. 9:00 AM-1050 0021 224
 * This program prompts the user to enter a decimal number between 0 and 15 and displays its 
 * corresponding binary value. Here are sample runs:

      <Output>

Enter a decimal number between 0 and 15: 11 <enter>

The binary number for 11 is 1011

      <End Output>

 

      <Output>

Enter a decimal number between 0 and 15: 5 <enter>

The binary number for 5 is 101

      <End Output>
 */


package lab5point3;

import java.util.*;

public class Lab5point3 {

	public static void main(String[] args) {
		
		int i;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter an integer:");
		
		i = scan.nextInt();
		
		scan.close();
		
		System.out.println(Integer.toBinaryString(i));
		
		
	}

}
