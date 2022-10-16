import java.util.Scanner;

public class Factor 
{
	public static void getFactor(int number)
	{
		int i=1;
		while(i<=number)
		{
			if(number%i==0)
			{
				System.out.println(i);
			}
			i++;
		}
	}
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=scanner.nextInt();
		getFactor(number);
		System.out.println("the Factors are>>"+number);
	}
}
