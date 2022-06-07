import java.util.Scanner;
import java.util.Random;

class Dog {
	String name;
	int age;
	String breed;
	
	public Dog(){
		name = "Clifford";
		age = 3;
		breed = "big red dog";
	}
	public Dog(String a){
		name = a;
		age = 1;
		breed = "dog dog";
	}
	public Dog(String a, String b){
		name = a;
		age = 1;
		breed = b;
	}
	public Dog(String a, int c){
		name = a;
		age = c;
		breed = "dog dog";
	}
	public void setName(String a){
		name = a;
		return;
	}
	public void setAge(int c){
		age = c;
		return;
	}
	public void setBreed(String b){
		breed = b;
		return;
	}
	
	public String getName(){
		return name;
	}
	
	public int getAge(){
		return age;
	}
	
	public String getBreed(){
		return breed;
	}
	
	public static boolean isSleeping(){
		Random rand = new Random();
		int x = rand.nextInt(2);
		if (x == 0)
		{
			return true;
		}
		else if (x == 1)
		{
			return false;
		}
		return false;
	}
	public void bark(){
		System.out.println(name + " barks");
		return;
	}
}
class starter {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Dog name?");
		String a = sc.nextLine();
		System.out.println("What age should " + a + " be?");
		int c = sc.nextInt();
		Dog g = new Dog(a,c);
		Dog h = new Dog("Max","Poodle");
		boolean m = g.isSleeping();
		boolean n = h.isSleeping();
		System.out.println(g.getName() + " is a " + g.getBreed() + " that is " + g.getAge() + " years old.");
		System.out.println(h.getName() + " is a " + h.getBreed() + " that is " + h.getAge() + " years old.");
		if(m == true)
		{
			System.out.println(a + " is sleeping! Don't wake " + a + " up!");
		}
		else if (m == false)
		{
			System.out.println(a + " is awake!");
			g.bark();
		}
		
		if (n == true && m == false)
		{
			System.out.println("Max is sleeping!");
			System.out.println("Max hears " + a);
			h.bark();
		}
		if(n == false && m == false)
		{
			System.out.println("Max is awake!");
			System.out.println("Max hears " + a);
			h.bark();
		}
		else if(n == false && m == true)
		{
			System.out.println("Max isn't sleeping!");
		}
	}
}
