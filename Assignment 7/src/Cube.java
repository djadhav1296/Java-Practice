import java.util.Scanner;

/*Design method public int getNumberCube(int num), return int value to that method and result 
 * should be into main method
 */
public class Cube 
{
	public static int getNumberCube(int num)
	{
	int c=num*num*num;
	return c;
	}
	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the no");
		int number=scanner.nextInt();
		Cube cube=new Cube();
		int c=cube.getNumberCube(number);
		System.out.println("The cube of number>>"+c);
	}
}
