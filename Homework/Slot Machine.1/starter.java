import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("Slot Machine Rules: ");
		System.out.println("1. Each player starts with $100.");
		System.out.println("2. Input a wager less than your total amount of money.");
		System.out.println("3. The slot machine will roll 3 numbers from 1 to 10.");
		System.out.println("   a. If two numbers match, you double your money.");
		System.out.println("   b. If three numbers match, you triple your money.");
		System.out.println("   c. If none match, you lose your money.");
		int n = 100;
		int counter = 0;
		int wager;
		while (true)
		{
			int x = rand.nextInt(11);
			int y = rand.nextInt(11);
			int z = rand.nextInt(11);
			System.out.println("-----------------------------------------------------");
			System.out.print("\nWould you like to play the slots? (Yes/yes/Y/y): ");
			String a = sc.nextLine();
			if (a.equals("No") || a.equals("no"))
			{
				System.out.println("Sad to see you go! You still have $" + n + " left. Come again soon! Thanks!");
				break;
			}
			else if (a.equals("Yes") || a.equals("yes") || a.equals("Y") || a.equals("y"))
			{
				System.out.print("You have $" + n + ". How much would you like to wager? ");
				wager = sc.nextInt();
				sc.nextLine();
				int e = 0;
				while (wager > n)
				{
					System.out.print("You only have $" + n + "! Please enter a smaller number: ");
					wager = sc.nextInt();
					sc.nextLine();
					if (wager <= n)
					{
						break;
					}
					e = e + 1;
				}
				
				while (wager <= 0)
				{
					System.out.println("Sneaky! No negatives or 0!");
					System.out.print("Please enter another number: ");
					wager = sc.nextInt();
					if (wager )
				}
				else if (wager > 0 && wager <= n)
				{
					System.out.println("\nGreat! Let's play!!!");
					System.out.println("Your rolls are: ");
					System.out.println("_________________");				
					System.out.println(" | " + x + " | " + y + " | " + z + " | ");
					System.out.println("_________________");
					if (x==y && y==z)
					{
						n = (3 * wager) + n - wager;
						System.out.println("You won! Your wager has now been tripled!");
						System.out.println("You now have $" + n);
					}
					else if (x==y || x==z || y==z)
					{
						n = (2 * wager) + n - wager;
						System.out.println("You won! Your wager has now been doubled!");
						System.out.println("You now have $" + n);
					}
					else if (x!=y && x!=z && y!=z)
					{
						n = n - wager;
						System.out.println("Didn't win this time, better luck next time!");	
						System.out.println("You now have $" + n);
						if (n == 0)
						{
							System.out.println("----------------------------------------------");
							System.out.println("You've run out of money! Thanks for coming! Come back soon");
							break;
						}
					}
				}
			}
			else 
			{
				System.out.println("That wasn't quite the correct answer. Try again.");
			}
		}
	}
}