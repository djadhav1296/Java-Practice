import java.util.Scanner;

/*Design method public int getReverseNumber(int num) 
 * which return int value to that method and result print into main method.
 */

//5432
public class ReverseNo 
{
	public  static void getReverseNumber(int number)
	{
		int rev=0;
		int rem;
		while(number!=0)
		{
			rem=number%10;
			rev=rev*10+rem;
			number=number/10;
			
			
		}
		System.out.println("The reverse of the no is"+rev);
	}
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the no");
		int rev=scanner.nextInt();
		getReverseNumber(rev);
	
		
	}
}
