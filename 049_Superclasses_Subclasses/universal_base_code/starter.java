import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
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

		
	}
}
