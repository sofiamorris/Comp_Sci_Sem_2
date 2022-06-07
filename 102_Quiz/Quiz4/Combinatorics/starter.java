import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Random rand = new Random();
		int n = rand.nextInt(12) + 1;
		int r = rand.nextInt(12) + 1;
		Combinatorics fact = new Combinatorics();
		fact.factorial(n);
	}
}
