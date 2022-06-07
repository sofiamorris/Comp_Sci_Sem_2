package pkg;
import java.util.Scanner;
import java.util.Random;


public class Role {
    Random rand = new Random();
    String name;
    int health;
    
	public Role(){
		name = "Kevin";
		health = rand.nextInt(6) + 5;
		}
	public String getName(){
	    return name;
	}
    public boolean attack(Zombie z){
        	int attack = rand.nextInt(6) + 5;
            System.out.println("Kevin strikes for " + attack + " damage on Zack.");
            return z.takeDamage(attack);
    }
     public boolean attack(Spider s){
         	int attack = rand.nextInt(6) + 5;
            System.out.println("Kevin strikes for " + attack + " damage on Charlotte.");
            return s.takeDamage(attack);
    }
}

