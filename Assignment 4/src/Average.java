//Write the Java Program to calculate total of five subject marks and average of it.
public class Average 
{
	public static int getAverage (int a,int b,int c,int d,int e )
	{
		int z=a+b+c+d+e;
		int y=z/5;
		return y;
				
	}
	public static void main(String[] args)
	{
		int x=getAverage(10,20,30,40,50);
		System.out.println("The average is>>"+ x);
	}
}
