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
		System.out.println("-----------------------------------------------------");
		System.out.print("Would you like to play the slots? (Yes/yes/Y/y): ");
		String a = sc.nextLine();
		System.out.print("You have $100. How much would you like to wager? ");
		int wager = sc.nextInt();
		int n = 100;
		int c = 0;
		while (true)
		{
			int x = rand.nextInt(11);
			int y = rand.nextInt(11);
			int z = rand.nextInt(11);
			if (a.equals("Yes") || a.equals("yes") || a.equals("Y") || a.equals("y"))
			{
				System.out.println("\nGreat! Let's play!!!");
				System.out.println("Your rolls are: ");
				System.out.println("_________________");				
				System.out.println(" | " + x + " | " + y + " | " + z + " | ");
				System.out.println("_________________");
				if (x==y && y==z)
				{
					n = (2 * wager) + n;
					System.out.println("You won! Your wager has now been tripled!");
					System.out.println("You now have $" + n);
					System.out.print("Would you like to play the slots? (Yes/yes/Y/y): ");
					String b = sc.nextLine();
					System.out.print("You have" + n + "How much would you like to wager? ");
					wager = sc.nextInt();
				}
				else if (x==y || x==z || y==z)
				{
					n = (3 * wager) + n;
					System.out.println("You won! Your wager has now been doubled!");
					System.out.println("You now have $" + n);
					System.out.print("Would you like to play the slots? (Yes/yes/Y/y): ");
					String d = sc.nextLine();
					System.out.print("You have" + n + "How much would you like to wager? ");
					wager = sc.nextInt();
				}
				else if (x!=y && x!=z && y!=z)
				{
					n = n - wager;
					System.out.println("Didn't win this time, better luck next time!");	
					System.out.println("You now have $" + n);
					System.out.print("Would you like to play the slots? (Yes/yes/Y/y): ");
					String d = sc.nextLine();
					System.out.print("You have" + n + "How much would you like to wager? ");
					wager = sc.nextInt();
					if (n == 0)
					{
						System.out.println("----------------------------------------------");
						System.out.println("You've run out of money! Thanks for coming! Come back soon");
						break;
					}
				}
			}
			else if(!a.equals("Yes") && !a.equals("yes") && !a.equals("Y") && !a.equals("y") && !a.equals("No") && !a.equals("no"))
			{
				System.out.println("That wasn't quite the correct answer. Try again.");				
				System.out.println("--------------------------------------------------");
			}
			else if(a.equals("No") || a.equals("no"))
			{
				System.out.println("Sad to see you go! You still have $100 left. Come again soon! Thanks!");
				break;
			}
			c = c + 1;
		}
	}
}
