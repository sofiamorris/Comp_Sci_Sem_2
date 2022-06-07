package pkg;
import java.util.Scanner;
import java.util.Random;


public class Wizard implements Role {
	Random rand = new Random();
	String name;
	int health;
	int attack;
	
	public Wizard() {
		name = "Johnny";
		health = 15;
		attack = 15;
	}

}

