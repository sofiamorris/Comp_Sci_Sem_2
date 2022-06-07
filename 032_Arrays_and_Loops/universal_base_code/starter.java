import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Random rand = new Random ();
		int c = 0;
		int[] number = new int[1000];
		while (c < 1000)
		{
			number[c] = rand.nextInt(100) + 1;
			System.out.print(number[c] + " ");
			c = c + 1;
		}


		
	}
}
