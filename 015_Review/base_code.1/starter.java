import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("What is your name?");
		String name = sc.nextLine();
		
		System.out.println("What is your title? Ex: Slayer of Dragons");
		String title = sc.nextLine();
		
		System.out.println("Would you like to be a Wizard, Warrior, or Rogue?");
		String choice = sc.nextLine();
		
		if (choice.equals("Wizard"))
		{
			System.out.println("You've chosen the Wizard! Excelsior!");
		}
		else if (choice.equals("wizard"))
		{
			System.out.println("You've chosen the Wizard! Excelsior!");
		}
		else if (choice.equals("Warrior"))
		{
			System.out.println("You've chosen the Warrior! For honor!");
		}
		else if (choice.equals("warrior"))
		{
			System.out.println("You've chosen the Warrior! For honor!");
		}
		else if (choice.equals("Rogue"))
		{
			System.out.println("You've chosen the Rogue! How cunning!");
		}
		else if (choice.equals("rogue"))
		{
			System.out.println("You've chosen the Rogue! How cunning!");
		}
		else
		{
			System.out.println("You've decided not to choose a role. Please choose Wizard, Warrior, or Rogue.");
		}
		
		System.out.println("\nYou have 25 skill points to spend in the following: Strength, Dexterity, Intelligence, Constitution, and Charisma. Spend them wisely.");
		
		System.out.print("\nStrength (1-10): ");
		int stren = sc.nextInt();
		int a;
		if (stren <= 10)
		{
			a = 25 - stren;
			System.out.println("You have " + a + " left to spend.");
		}
		else
		{
			System.out.print("Please input a value within the point limit. Strength (1-10): ");
			stren = sc.nextInt();
			a = 25 - stren;
			System.out.println("You have " + a + " left to spend.");
		}
		
		System.out.print("\nDexterity (1-10): ");
		int dext = sc.nextInt();
		int b;
		if (dext <= 10)
		{
			b = a - dext;
			System.out.println("You have " + b + " left to spend.");
		}
		else
		{
			System.out.print("Please input a value within the point limit. Dexterity (1-10): ");
			dext = sc.nextInt();
			b = a - dext;
			System.out.println("\nYou have " + b + " left to spend.");
		}
		
		System.out.print("\nIntelligence (1-10): ");
		int intel = sc.nextInt();
		int c;
		if (b >= intel && intel < 10)
		{
			c = b - intel;
			System.out.println("You have " + c + " left to spend.");
		}
		else
		{
			System.out.print("Please input a value within point limit. Intelligence (1-10): ");
			intel = sc.nextInt();
			c = b - intel;
			System.out.println("\nYou have " + c + " left to spend.");
		}
		
		System.out.print("\nConstitution (1-10): ");
		int cons = sc.nextInt();
		int d;
		if (c >= cons && cons < 10)
		{
			d = c - cons;
			System.out.println("You have " + d + " left to spend.");
		}
		else
		{
			System.out.print("Please input a value within point limit. Constitution (1-10): ");
			cons = sc.nextInt();
			d = c - cons;
			System.out.println("\nYou have " + d + " left to spend.");
		}
			
		System.out.print("\nCharisma (1-10): ");
		int cha = sc.nextInt();
		
		if (d < cha || cha > 10)
		{
			System.out.print("Please input a value within point limit. Charisma (1-10): ");
			cha = sc.nextInt();
		}
		
		System.out.println("\n-------------------------------------------------");
		System.out.println("You are " + name + ", the " + title + " of CVHS.");
		System.out.println("You're a " + choice + " with the following stats!");
		System.out.println("Strength - " + stren);
		System.out.println("Dexterity - " + dext);
		System.out.println("Intelligence - " + intel);
		System.out.println("Constitution - " + cons);
		System.out.println("Charisma - " + cha);
		System.out.println("\nGood luck on your quest " + name + "!");

	}
}
