package com.assignments;

import java.util.Scanner;

public class EmployeeInformation 
{
	public void getUserInput()
	{
		System.out.println("Enter the First name");
		Scanner scanner=new Scanner(System.in);
		String fname=scanner.next();
		System.out.println("Enter the last name");
		String lname=scanner.next();
		System.out.println("Enter the city");
		String cname=scanner.next();
		System.out.println("Enter the country");
		String Country=scanner.next();
		System.out.println("Enter the Mob NO");
		Long no=scanner.nextLong();
		
	}
	public static void main(String[] args)
	{
		EmployeeInformation employeeInformation=new EmployeeInformation();
		System.out.println("Enter the no of studentys");
		Scanner scanner=new Scanner(System.in);
		int count=scanner.nextInt();
		for(int i=1;i<=count;i++)
		{
			System.out.println("Enter the student details");
			employeeInformation.getUserInput();
		}
	}

}

