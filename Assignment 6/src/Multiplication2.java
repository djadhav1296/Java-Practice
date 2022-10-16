/*Design method void multiplication (int no) and print the multiplication table
 * . ( Example enter the no=5 then output like 
 */
public class Multiplication2 {
	void multiplication(int no)
	{
		for(int i=1;i<=10;i++)
		{
			
			System.out.println(no+"*"+ i+ "="+no*i);
		}
	}
	public static void main(String[] args)
	{
		Multiplication2 multiplication2=new Multiplication2();
		multiplication2.multiplication(5);
		
	}
}
