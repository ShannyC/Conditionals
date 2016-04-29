import java.util.Scanner;
public class Conditionals {

	public static void main(String[] args) {
		Scanner userInput = new Scanner (System.in);
		System.out.println("How old are you?");
		int age = userInput.nextInt();
		if (age < 5)
		{
			System.out.println("Hey, you shouldn't even be in school yet.");
		}
		else if (age > 18)
		{
			System.out.println("Aren't you a little old to still be in high school?");
		}
		else 
		{
			System.out.println("Isn't school wonderful?");
		}
		System.out.println("What's your favorite type of pet?");
		System.out.println(" (1) dog");
		System.out.println(" (2) cat");
		System.out.println(" (3) other");
		int choice = userInput.nextInt();
		if (choice == 1)
		{
			System.out.println("I like dogs, too.");
		}
		else if (choice == 2)
		{
			System.out.println("Agreed, they are so cute.");
		}
		else
		{
			System.out.println("Ah, I like people with unconventional favorites.");
		}
	
	}

}
