/*Write the java program to design method for division of two number which returns int value to that method
 *  and result should be print into main method.
 */
public class Division 
{
	public static int getDivison(int a,int b)
	{
		int c=a/b;
		return c;
	}
		public static void main(String args[])
		{
			int div=getDivison(50,10);
			System.out.println("The Divison is>>"+ div);
		}
}
