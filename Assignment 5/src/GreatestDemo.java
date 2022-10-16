//3.write a program to find out maximum number among three number(if else if ladder statement)
public class GreatestDemo 
{
	public static void main(String[] args)
	{
		int a=100;
		int b=2000;
		int c=30000;
		
		if (a>b && a>c)
		{
			System.out.println("a is greater");
		}
		else if(b>a && b>c)
		{
			System.out.println("b is greater");
		}else if(c>a && c>b)
		{
			System.out.println("c is greater");
		}
		else
		{
			System.out.println("Invalid op");
		}
	}
}
