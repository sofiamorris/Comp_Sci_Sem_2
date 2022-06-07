import java.util.Scanner;

class Cat {
	String name;
	
	public Cat () {
		name = "Garfield";
	}
	public Cat (String a){
		name = a;
	}
	public void meow(){
		System.out.println(name + " meows");
		return;
	}
}
class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your cat's name?");
		String a = sc.nextLine();
		Cat traits = new Cat();
		Cat traits2 = new Cat(a);
		traits.meow();
		traits2.meow();
	}
}
