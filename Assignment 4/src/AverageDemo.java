//Write the Java Program to calculate total of five subject marks and average of it.
public class AverageDemo 
{
	public static void main(String args[])
	{
		int math=90;
		int sci=95;
		int hist=91;
		int english=96;
		int marathi=85;
		int res=math+sci+hist+english+marathi;
		System.out.println("The sum of the Five Subject is>>"+ res);
		float f=res/5;
		System.out.println("The average is>>"+f);
	}
}
