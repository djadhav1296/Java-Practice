/*Write the java program to design method for addition of two number which returns int results to that method and result
 *  should be print into main method.
 */
public class AddDemo 
{
	public int getAddition(int a,int b)
	{
		int c=a+b;
		return c;
	}
	public static void main(String[] args)
	{
		AddDemo addDemo=new AddDemo();
		int sum=addDemo.getAddition(10,20);
		System.out.println("the addition is>>"+sum);
	}
}
