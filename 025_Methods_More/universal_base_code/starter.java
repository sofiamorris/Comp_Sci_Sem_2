import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		myCharacter trait = new myCharacter();
		trait.setRole("Warrior");
		trait.setStrength(0);
		trait.setDexterity(0);
		trait.setIntelligence(0);
		trait.setConstitution(0);
		trait.setCharisma(0);
		trait.myToString();
		System.out.println("What class would you like to be?");
		String a = sc.nextLine();
		myCharacter trait2 = new myCharacter(a);
		trait2.myToString();
		
	}
}
