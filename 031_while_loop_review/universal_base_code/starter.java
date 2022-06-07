import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Random rand = new Random();
		int c = 0;
		while (true)
		{
			int a = rand.nextInt(100) + 1;
			System.out.println(a);
			if (c == 99)
			{
				break;
			}
			c = c + 1;
		}
	}
}
