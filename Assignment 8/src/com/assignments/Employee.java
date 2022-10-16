/*Design the Employee class which contain
*firstName, lastName, 
c*ity and mobileNumber and  country.
*/

package com.assignments;

import java.util.Scanner;

public class Employee 
{
	public static void main(String[] args)
	{
		EmployeeInformation employeeInformation=new EmployeeInformation();
		employeeInformation.getUserInput();
		
		System.out.println("Enter the Fist name");
		Scanner scanner=new Scanner(System.in);
		String firstname=scanner.next();
		System.out.println("Enter the Last name");
		String lastname =scanner.next();
		System.out.println("Enter the City name");
		String city =scanner.next();
		System.out.println("Enter mobile no");
		long no=scanner.nextLong();
		System.out.println("Enter The Country");
		String country=scanner.next();
		System.out.println(firstname  +  lastname  +  city  +  no  +  country);
		
		
		
		

		
		
	}
}
