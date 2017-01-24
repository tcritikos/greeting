import java.util.Scanner;
public class Greeting
	{

		public static void main(String[] args)
			{
				Scanner userInput= new Scanner(System.in);
				System.out.println("what is your name?");
				String name = userInput.nextLine();
				System.out.println("Hello, " + name + "!");
			
				if(name.equals ("theo"))
				
					{ 
						System.out.println("Your cool");
					}
				
				else if(name.equals ("ted"))
					
					{
						System.out.println("awesome name!");
					}
					
				else 
					
					{
						System.out.println(" cool name");
					}
				
				System.out.println("what is your favorite color?");
				String color = userInput.nextLine();
				System.out.println("I like " + color + " too!");
			

			}
	}