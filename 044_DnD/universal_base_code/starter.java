import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Random rand = new Random();
		DnD war = new DnD();
		DnD wizard = new DnD();
		wizard.setName("Dumbledore");
		System.out.println("This is " + wizard.getName());
		DnD warrior = new DnD();
		warrior.setName("Jim");
		System.out.println("This is " + warrior.getName());
		DnD artificer = new DnD();
		artificer.setName("Robinson");
		System.out.println("This is " + artificer.getName());

		
	}
}
