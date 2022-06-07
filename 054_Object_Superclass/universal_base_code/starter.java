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
		System.out.println();
		Apprentice h = new Apprentice();
		Apprentice i = new Apprentice("USC", 10);
		Apprentice j = new Apprentice("flute", "Julliard", 12);
		Apprentice k = new Apprentice("Jessica", 21, "violin", "Harvard", 13);
		h.playInstrument();
		System.out.println();
		i.practice();
		System.out.println();
		j.perform();
		System.out.println();
		k.practiceAtUniversity();
		System.out.println();
		Performer[] perf = new Performer[4];
		perf[0] = new Performer();
		perf[1] = new Musician();
		perf[2] = new Apprentice();
		perf[3] = new Actor();
		perf[0].perform();
		perf[0].practice();
		System.out.println();
		perf[1].perform();
		((Performer)perf[1]).practice();
		System.out.println();
		((Apprentice)perf[2]).practiceAtUniversity();
		((Musician)perf[2]).playInstrument();
		System.out.println();
		((Actor)perf[3]).monologue();
		((Performer)perf[3]).perform();
		System.out.println();
		System.out.println(perf[0].toString());
		System.out.println(perf[1].toString());
		System.out.println(perf[2].toString());
		System.out.println(perf[3].toString());
		System.out.println(perf[0].equals(perf[1]));
		
	}
}
