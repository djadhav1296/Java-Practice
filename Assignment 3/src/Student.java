
public class Student 
{
	String getStudentName(String name) 
	{
		return  name;
		
	}
	public static void main(String[] args)
	{
		Student student=new Student();
		String str=student.getStudentName("Dhiraj");
		System.out.println("The strudent name is>>"+str);
	}
}
