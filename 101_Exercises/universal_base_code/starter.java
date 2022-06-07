import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.println("Pick a type of Ascii art (Human, Dog, Cactus, Snail, or Other): ");
		String a = sc.nextLine();
		System.out.println("What is Ascii art's name?: ");
		String b = sc.nextLine();
		System.out.println("How many times do you want to print the Ascii art?: ");
		int c = sc.nextInt();
		Ascii one = new Ascii(a,b,c);
		one.setType(a);
		one.setName(b);
		one.setNumber(c);
		Ascii two = new Ascii(a);
		two.setType(a);
		Ascii three = new Ascii(a,b);
		three.setType(a);
		three.setName(b);
		Ascii four = new Ascii(a,c);
		four.setType(a);
		four.setNumber(c);
		two.printArt();
		three.printArt();
		four.printArt();
		one.printArt();
		
		
		
		
		
	}
}
