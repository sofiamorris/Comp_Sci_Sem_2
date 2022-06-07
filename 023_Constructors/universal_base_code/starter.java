import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		myCharacter trait = new myCharacter();
		System.out.println("Your role is " + trait.role);
		System.out.println("Your strength trait is " + trait.strength);
		System.out.println("Your dexterity trait is " + trait.dexterity);
		System.out.println("Your intelligence trait is " + trait.intelligence);
		System.out.println("Your constitution trait is " + trait.constitution);
		System.out.println("Your charism trait is " + trait.charisma);
		System.out.println("--------------------------------------");
		
		System.out.println("What class would you like to be?");
		String a = sc.nextLine();
		myCharacter trait2 = new myCharacter(a);
		System.out.println("Your strength trait is " + trait.strength);
		System.out.println("Your dexterity trait is " + trait.dexterity);
		System.out.println("Your intelligence trait is " + trait.intelligence);
		System.out.println("Your constitution trait is " + trait.constitution);
		System.out.println("Your charism trait is " + trait.charisma);


		
	}
}
