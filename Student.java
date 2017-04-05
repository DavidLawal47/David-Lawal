package org.adminSys.src;

import java.util.Random;
import java.util.Scanner;

public class Student {
	public static void main(String...args)
	{
		
	}
	
	private String firstname1;
	private String lastname1;
	private int studentID;
	private String emailadress;
	
	public Student()
	{
		//Default Constructor
	}
	public Student(String firstname1, String lastname1, int studentID) 
	{
		//this.firstname1 = firstname1;
	    this.setFirstname1(firstname1);
		this.setLastname1(lastname1);
		this.setStudentID(studentID);
		this.setEmailadress();	
	}
	/*public Student(String firstname1, String lastname1, int studentID, String emailadress) 
	{
		//this.firstname1 = firstname1;
	    this.setFirstname1(firstname1);
		this.setLastname1(lastname1);
		this.setStudentID(studentID);
		this.setEmailadress(emailadress);	
	
	}//Constructor
*/	

	public String getFirstname1()
	{
		return firstname1;
	}


	public void setFirstname1(String firstname1) 
	{
		this.firstname1 = firstname1.toUpperCase();
	}


	public String getLastname1() 
	{
		return lastname1;
	}


	public void setLastname1(String lastname1) 
	{
		this.lastname1 = lastname1.toUpperCase();
	}


	public int getStudentID()
	{
		return studentID;
	}


	public void setStudentID(int studentID)
	{
		this.studentID = studentID;
	}


	public String getEmailadress()
	{
		return emailadress;
	}


	public void setEmailadress()
	{
		
		this.emailadress = studentID  + "_" + firstname1.substring(0, 1) + lastname1.toLowerCase() + "@KennesawStateUniversiy.edu"; 
	}

	//Operations
	
	public static String generateIdentification() 
	{
		
		Random rnd = new Random();
	
		return("90" + rnd.nextInt(9999999));
	}//generateIdentification(#)
	
	@SuppressWarnings("resource")
	public void createStudent()
	{ 
		
		Scanner scan = new Scanner(System.in);
		
		do
		{
		System.out.println("Enter Firstname");
		firstname1 = scan.nextLine();
		
		System.out.println("Enter last name");
		lastname1 = scan.nextLine();
		
		firstname1 = AdminDashboard.validateName(firstname1);
		lastname1 = AdminDashboard.validateName(lastname1);
				
		if(!firstname1.equals("") && !lastname1.equals("")) 
		{
			Student std1 = new Student(firstname1,lastname1,Integer.parseInt(Student.generateIdentification()));
			
			System.out.println(std1);
			break;
		}
		else
		{
			System.out.println("Make sure first & last name contain only letters, please try again");
			
		}
		}
		while(true);
}
	
	@Override
	public String toString() {
		return "STUDENT FIRSTNAME:" + firstname1 +  
				"\nSTUDENT'S LASTNAME:"+ lastname1 +
				"\nSTUDENT ID:" + studentID + 
				"\nEMAIL ADDRESS:"+ emailadress;
	}
}
