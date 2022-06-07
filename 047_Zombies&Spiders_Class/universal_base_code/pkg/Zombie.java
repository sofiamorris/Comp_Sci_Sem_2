package pkg;
import java.util.Scanner;
import java.util.Random;


public class Zombie implements Creature {
	Random rand = new Random();
	String name;
	int health;
	int attack;
	public Zombie(){
		name = "Zack";
		health = rand.nextInt(6) + 5;
		attack = rand.nextInt(6) + 5;
	}
	public boolean isDead(){
		if (health <= 0){
			System.out.println("Zack is dead :(");
			return true;
		}
		else{
			return false;
		}
	}
	public boolean takeDamage(int damage){
			health = health - damage;
			return isDead();
	}
	public String getName(){
		return name;
	}
	public int getHealth(){
		return health;
	}

}

