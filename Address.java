package org.adminSys.src;
import java.util.*;
public class Address {

	public static void main(String[] args) 
	{
	
	}
		
		private String state;
		private String city;
		private String street;
		private int zipcode;
		
		public Address()
		{
			this.setState(state);
			this.setCity(city);
			this.setStreet(street);
			this.setZipcode(zipcode);
		}

		/**
		 * @return the state
		 */
		public String getState() {
			return state;
		}

		/**
		 * @param state the state to set
		 */
		public void setState(String state) {
			this.state = state;
		}

		/**
		 * @return the city
		 */
		public String getCity() {
			return city;
		}

		/**
		 * @param city the city to set
		 */
		public void setCity(String city) {
			this.city = city;
		}

		/**
		 * @return the street
		 */
		public String getStreet() {
			return street;
		}

		/**
		 * @param street the street to set
		 */
		public void setStreet(String street) {
			this.street = street;
		}

		/**
		 * @return the zipcode
		 */
		public int getZipcode() {
			return zipcode;
		}

		/**
		 * @param zipcode the zipcode to set
		 */
		public void setZipcode(int zipcode) {
			this.zipcode = zipcode;
		}
		
		
		public static String validateAddress(String Address)
		{
			if(!Address.matches("[A-Za-z]+"))
			{
				Address = "";
				
			}
			return Address;
		}
			
			public String validateZipcode(String zipcode)
			{
				if(!zipcode.equals("[0-9]+"))
				{
					zipcode = " ";
				}
				return toString();
				
		}
		
		
			@SuppressWarnings({ "rawtypes", "resource" })
			public Collection createAddress()
			{
				Scanner scan = new Scanner(System.in);
				
				do
				{
					System.out.println("Enter State");
					state = scan.nextLine();
					
					
					System.out.println("Enter City");
					city = scan.nextLine();
					
					
					System.out.println("Enter Street");
					street = scan.nextLine();
					
					System.out.println("Enter Zipcode");
					zipcode = scan.nextInt();
					
					
					state = Address.validateAddress(state);
					city = Address.validateAddress(city);
					street = Address.validateAddress(street);
					zipcode = Integer.valueOf(zipcode);
					break;
					
				}while(true);
				return createAddress();
				
			}

}
