import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner (System.in);
		Random rand = new Random ();
		
		System.out.println("Pick a number between 1 - 1000: ");
		int number = sc.nextInt();
		
		int x = rand.nextInt(1000) + 1;
		
		if (x < number)
		{
			System.out.println("Your number was larger than the number. The number was " + x);
		}
		else if (x > number)
		{
			System.out.println("Your number was smaller than the number. The number was " + x);
		}
	}
}
