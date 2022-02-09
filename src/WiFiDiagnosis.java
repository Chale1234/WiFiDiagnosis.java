
/*
 * Class: CMSC203 CRN 34164
 * Instructor:Professor Ahmed Tarik
 * Program: Assignment # 1
 * Description: (This program will build an application that will step 
 *               through possible WiFi problems to restore Internet connectivity.)
 * Due: February 7,2022
 * Platform/compiler:Enchalew Abebe
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Enchalew Abebe
*/


import java.util.Scanner;
public class WiFiDiagnosis {
	// it creates a Scanner object from the object
	static Scanner scan = new Scanner (System.in);

	public static void main(String[] args) {
		// This program hold variables
		String answer;
		
		// This program print out the first statement of the program
		System.out.print("If you have a problem with internet conncectivity,");
		System.out.println( " this WiFi Diagnosis might work.");
		System.out.println(" First step: reboot your computer");
		System.out.println(" Are you able to connect with the internet?(Yes or No)");
		answer= scan.nextLine();
		
		// This program validate if else statement and display the result 
	if ("yes".equalsIgnoreCase(answer))
		{
			System.out.println(" Rebooting your computer seemed to work");
		}
		
	else
		{
			if ("no".equalsIgnoreCase(answer))
		
		{
			System.out.println(" Second Step: reboot your router ");
			System.out.println(" Now are you able to connect with the internet?(yes or no)");
			answer=scan.nextLine();
		} 
			{
				if ("no".equalsIgnoreCase(answer))
			
			{
				System.out.print(" Third step: make sure the cables to your router ");
				System.out.println(" are plugged in firmly and your router is getting power.");
				System.out.println(" Now are you able to connect with the internet?(yes or no)");
				answer=scan.nextLine();	
			}
     
    	 {
    	 	if ("no".equalsIgnoreCase(answer)) 
    	
			{
				System.out.println(" Fourth Step: Move your computer closer to your router");
				System.out.println(" Now are you able to connect with the internet?(yes or no)");
				answer=scan.nextLine();
			}
   	
 
   			{
   				if("no".equalsIgnoreCase(answer))
 
	 		{
				System.out.println(" Fifth step: Contact your ISP");
			    System.out.println(" Make sure your ISP is hooked up to your router.");
			
		     }
   		else
   		{
   			System.out.println(" Checking the router's cable seemed to work");
   		}
   			}
    	 }
			}
		}
	
		 
	 }
	
	}
				
	 

     
		



