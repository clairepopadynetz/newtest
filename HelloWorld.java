import java.util.Scanner;
public class HelloWorld
{
		public static void main(String[]argv)
		{
			System.out.println("Your Name?");
				Scanner keyboard = new Scanner(System.in);
				String name = keyboard.nextLine();
				System.out.println("Hello " + name + "!");
		}

}
