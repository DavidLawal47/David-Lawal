/*
 * David B. Lawal
 * Prof. Naidu
 * Class CSCI 1301 20867 Mon and Wed. 9:00 AM-1050 0021 224
 * This program is a simple Calculator simulator that takes the sum, 
 * difference, product etc. of two variable. Its also user interactive
 * 
 */
import java.util.Scanner;// import java preset library that accepts devices that deals with user interactions ex. keyboard or mouse

import java.util.*;

public class Lab11Calculator {

	public static void main(String[] args) {
		

		int fNum;// fNum stands for fisrt Number
		
		int sNum;// Stands for second Number
		
		Scanner scan = new Scanner(System.in);// allows the user to input their value.
		
		
		System.out.println("Please enter first Number");
		
		fNum = scan.nextInt();// allows compiler to accept user input only integers
		
		System.out.println("Please enter second Number");
		
		sNum = scan.nextInt();// allows compiler to accept user input olny integers
		
		int sum = (fNum + sNum);
		
		System.out.println("The sum is: "+sum);
		
		int sub = (fNum - sNum);
		
		System.out.println("The difference is: "+sub);
		
		int product = (fNum * sNum);
		
		System.out.println("The product is: "+product);
		
		float quotient = (fNum / sNum);
		
		System.out.println("The quotient is: "+quotient);
		
		float average = (fNum + sNum/2);
		
		System.out.println("The avergae is: "+average);
		
		
		

	}

}
