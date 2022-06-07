package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter {
	public String role = new String("No role");
	public int strength;
	public int dexterity;
	public int intelligence;
	public int constitution;
	public int charisma;

	public myCharacter() {
		role = ("No Role");
		strength = 0;
		dexterity = 0;
		intelligence = 0;
		constitution = 0;
		charisma = 0;
	}
	
	public myCharacter(String a) {
		role = a;
		if (a.equals("Warrior") || a.equals("warrior"))
		{
			System.out.println("You've chosen the Warrior! For honor!");
			System.out.println("Your role is " + a);
		}
		else if (a.equals("Wizard") || a.equals("wizard"))
		{
			System.out.println("You've chosen the Wizard! Excelsior!");
			System.out.println("Your role is " + a);
		}
		else if (a.equals("Rogue") || a.equals("rogue"))
		{
			System.out.println("You've chosen the Rogue! How cunning!");
			System.out.println("Your role is " + a);
		}
		else
		{
			System.out.println("You've decided not to choose a role. Rerun program.");
			role = "No role";
			System.out.println("Your role is " + role);
		}
	}

}

