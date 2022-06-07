import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Zombie Zack = new Zombie();
		Spider Charlotte = new Spider();
		Role Kevin = new Role();
		System.out.println("This is " + Zack.getName());
		System.out.println("This is " + Charlotte.getName());
		System.out.println("This is " + Kevin.getName());
		System.out.println();
		for(int i = 0; Zack.getHealth() > 0; i++){
			Kevin.attack(Zack);
		}
		for(int i = 0; Charlotte.getHealth() > 0; i++){
			Kevin.attack(Charlotte);
		}
		
	}
}
