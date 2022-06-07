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
	public void Dwarf(String name, int age){
		this.name = name;
		this.age = age;
		return;
	}
//	public boolean isSameName(String name){
		
	//}
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
		for(int i = 0; i < dwarf.length; i++){
			dwarf[i] = new Dwarf();
			int x = rand.nextInt(7);
			String z = n[x];
			int y = rand.nextInt(100) + 1;
			dwarf[i].Dwarf(z,y);
		}
		int c = 0;
		for(int i = 0; i < dwarf.length; i++){
			if(dwarf[i].getName().equals(dwarf[0].getName())){
				c++;
			}
		}
		System.out.println(dwarf[0].getName() + " was the name with " + c + " matches!");
	}
}