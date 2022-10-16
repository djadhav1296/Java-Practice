//Design the separate method as String getStudentName (String name) which return student name and print it.

public class NameDemo 
{
	String getStudentName (String name)
	{
		return name;
	}
	public static void main(String args[])
	{
		NameDemo nameDemo=new NameDemo();
		String x=nameDemo.getStudentName("Dhiraj");
		System.out.println("The name is>>"+x);
	}
	
}
