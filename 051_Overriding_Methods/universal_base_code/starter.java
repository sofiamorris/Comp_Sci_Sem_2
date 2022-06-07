import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Performer a = new Performer();
		Performer b = new Performer("Lil Nas X", 24);
		Musician c = new Musician();
		Musician d = new Musician("Cello");
		System.out.println();
		System.out.println("Performer 1's name is " + a.getName());
		a.practice();
		System.out.println();
		System.out.println("Performer 2's name is " + b.getName());
		b.perform();
		System.out.println();
		System.out.println("Musician 1's name is " + c.getName());
		c.perform();
		c.playInstrument();
		System.out.println();
		d.practice();
		System.out.println("Musician 2's instrument is " + d.getInstrument());
		System.out.println("-------------------------------------");
		Musician e = new Musician("Kanye", "piano");
		Musician f = new Musician("Drake", 22, "guitar");
		System.out.println("Performer 1's name is " + e.getName());
		e.practice();
		System.out.println("Musician 3's instrument is " + e.getInstrument());
		System.out.println();
		System.out.println("Musician 4's name is " + f.getName());
		f.perform();
		f.playInstrument();
		System.out.println();
		Actor g = new Actor("Leonardo DeCaprio", "theater");
		g.practice();
		g.perform();
		g.monologue();
	}
}
