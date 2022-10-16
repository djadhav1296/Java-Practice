/*Write the java program to design method for multiplication of two number which returns int value to that method 
 * and result should be print into main method.
 */
public class Multiplication {
	public int getMultiplication(int a,int b)
	{
		int c=a*b;
		return c;
	}
	public static void main(String[] args) 
	{
		Multiplication multiplication=new Multiplication();
		int x=multiplication.getMultiplication(5, 10);
		System.out.println("The multiplication is>>"+ x);
	}

}
