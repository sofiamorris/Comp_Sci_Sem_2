package pkg;
import java.util.Scanner;
import java.util.Random;

public class myCharacter {
	public String role;
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
		}
		else if (a.equals("Wizard") || a.equals("wizard"))
		{
			System.out.println("You've chosen the Wizard! Excelsior!");
		}
		else if (a.equals("Rogue") || a.equals("rogue"))
		{
			System.out.println("You've chosen the Rogue! How cunning!");
		}
		else
		{
			System.out.println("You've decided not to choose a role. Rerun program.");
			role = "No role";
		}
	}
	
	public void myToString(){
		System.out.println("Your role is " + role);
		System.out.println("Your strength trait is " + strength);
		System.out.println("Your dexterity trait is " + dexterity);
		System.out.println("Your intelligence trait is " + intelligence);
		System.out.println("Your constitution trait is " + constitution);
		System.out.println("Your charimsa trait is " + charisma);
		System.out.println("--------------------------------------------");
		return;
	}
	public String setRole(String a){
		role = a;
		if (a.equals("Warrior") || a.equals("warrior"))
		{
			System.out.println("You've chosen the Warrior! For honor!");
		}
		else if (a.equals("Wizard") || a.equals("wizard"))
		{
			System.out.println("You've chosen the Wizard! Excelsior!");
		}
		else if (a.equals("Rogue") || a.equals("rogue"))
		{
			System.out.println("You've chosen the Rogue! How cunning!");
		}
		else
		{
			System.out.println("You've decided not to choose a role. Rerun program.");
			role = "No role";
	}
	return a;
	}
	public int setStrength(int b){
		strength = b;
		return b;
	}
	public int setDexterity(int c){
		dexterity = c;
		return c;
	}
	public int setIntelligence(int d){
		intelligence = d;
		return d;
	}
	public int setConstitution(int e){
		constitution = e;
		return e;
	}
	public int setCharisma(int f){
		charisma = f;
		return f;
	}
	public static boolean setAll(String a, int b, int c, int d, int e, int f){
		if (true)
		{
			return true;
		}
		return true;
	}
}

