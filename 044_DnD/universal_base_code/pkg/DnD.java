package pkg;
import java.util.Scanner;
import java.util.Random;


public class DnD {
	Random rand = new Random();
	String name;
	int health;
	int attack;

	public DnD(){
		name = "Craig";
		health = 12;
		attack = 8;
	}
	public DnD(String name){
		this.name = name;
		health = 12;
		attack = 8;
	}
	public void setHealth(int health){
		this.health = health;
		health = rand.nextInt(15) + 1;
		return;
	}
	public int getHealth(){
		return health;
	}
	public void setName(String name){
		this.name = name;
		return;
	}
	public String getName(){
		return name;
	}
	public void attack(Warrior w){
		int attack = rand.nextInt(15) + 1;
		int ah = w.getHealth();
		int nah = ah - attack;
		w.setHealth(nah);
	}
	public void attack2(Wizard i){
		int attack = rand.nextInt(15) + 1;
		int ih = i.getHealth();
		int nih = ih - attack;
		i.setHealth(nih);
	}
}

