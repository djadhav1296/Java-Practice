/*Write the java program to design method for substraction of two number which returns int value to that method 
 * and result should be print into main method.
 */
public class SubDemo 
{
	public static int getSubstraction(int x,int y)
	{
		int z=x-y;
		return z;
	}
		public static void main(String[] args)
		{
			int sub=getSubstraction(50,10);
			System.out.println("The Substraction is>>"+ sub);
		}
}
