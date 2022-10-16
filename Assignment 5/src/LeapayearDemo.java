//2.write a program  to check whether  year is leap year or not. (If else stmt).
public class LeapayearDemo 
{
	public static void main(String[] args)
	{
		int year=2024;
		if (year % 4==0 || year % 400==0 )
		{
			System.out.println("Leap Year..");
		}else
		{
			System.out.println("Not a leap year");
		}
		
	}	
}