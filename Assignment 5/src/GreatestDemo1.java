
public class GreatestDemo1 {
	public static void main(String[] args) {
		int x = 100;
		int y = 80;
		int z = 150;
		if (x > y && x > z)
		{
		System.out.println("The Greatest number amoung given three numbers is>>" + x);
		} 
		else if (y > x && y > z) {
		System.out.println("The Greatest number amoung given three numbers is>>" + y);
		}
		else if (z > x && z > y) {
		System.out.println("The Greatest number amoung given three numbers is>>" + z);
		}
		else {
		System.out.println("Invalid input");
		}
		}

}
