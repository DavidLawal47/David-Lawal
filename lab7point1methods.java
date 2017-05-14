/*David B. Lawal
 * Prof. Naidu
 * Class CSCI 1301 20867 Mon and Wed. 9:00 AM-1050 0021 224
 * Write a program with reads a Celsius degree value from the console or a Fahrenheit degree value from the console , 
 * then converts it to Fahrenheit or Celsius and displays the result. The formulas for the conversion are as follows:
	Fahrenheit = (9 / 5) * Celsius + 32
	Celsius = (5/9) *(Fahrenheit -32)
*/

import java.util.*;

public class lab7point1methods {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to the temperature converter." + "\n");
		
		System.out.println("Enter in a degree you want to convert" + "\n");
		
		// Display table
				System.out.println(
					"\nCelsius     Fahrenheit     |     Fahrenheit    Celcius\n" +
					"----------------------------------------------");
				for (double celsius = 40.0 , fahrenheit = 120; celsius <= 104.0; celsius++, fahrenheit += 5) {
					System.out.printf("%4.1f     ", celsius);
					System.out.printf("%6.3f", celsiusToFahrenheit(celsius));
					System.out.print("     |     ");
					System.out.printf("%-11.1f", fahrenheit);
					System.out.printf("%7.3f\n", fahrenheitToCelsius(fahrenheit));
				}
	}
	
		
	
	


//Convert from Celsius to Fahrenheit 

public static double celsiusToFahrenheit(double celsius)
{
	//celsius = 0.0;
	celsius = (9.0 / 5) * celsius + 32;
	return celsius;
	
}

//Converts from Fahrenheit to celsius
public static double fahrenheitToCelsius(double fahrenheit){
	
	//fahrenheit = 0.0;
	 fahrenheit = (5.0/9) *(fahrenheit -32);
	
	return fahrenheit;
	
}
}
