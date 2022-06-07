import pkg.*;
import java.util.Scanner;
import java.util.Random;

class Dwarf{
	String name;
	int age;
	
	public Dwarf(){
		name = "";
		age = 0;
	}
	public void setCharacter(String a, int b){
		name = a;
		age = b;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
}
class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Random rand = new Random();
		Dwarf[] dwarf = new Dwarf[100];
		String[] n = {"Grumpy","Dopey","Doc","Happy","Bashful","Sneezy","Sleepy"};
		for(int i = 1; i < dwarf.length; i++){
			dwarf[i] = new Dwarf();
			int x = rand.nextInt(7);
			String z = n[x];
			int y = rand.nextInt(100) + 1;
			dwarf[i].setCharacter(z,y);
		}
		for(int i = 1; i < dwarf.length; i++){
			System.out.println("Dwarf " + i + ": " + dwarf[i].getName() + " is " + dwarf[i].getAge() + " years old!");
		}

	}
}
