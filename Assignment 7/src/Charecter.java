import java.util.Scanner;

//1. Design method to check whether the character is alphabet, digit and special symbol.
public class Charecter 
{
	public static void charType(int ch)
	{
		if(ch>65 && ch<=90)
		{
			System.out.println("This is upper case Alphabet");
			
		}else if(ch>97 && ch<=122)
		{
			System.out.println("This is lower case Alphabet");
		}else if(ch>48 && ch<=57)
		{
			System.out.println("This is no");
			
		}else 
		{
			System.out.println("invalid ip");
		}
	}
	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Charecter to be checked");
		int ch=scanner.next().charAt(0);
		charType(ch);
		
		
	}
}
