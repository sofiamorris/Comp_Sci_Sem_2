package pkg;
import java.util.Scanner;
import java.util.Random;


public interface Creature {
public boolean isDead();
	public boolean takeDamage(int damage);
	public String getName();
	public int getHealth();	
}

