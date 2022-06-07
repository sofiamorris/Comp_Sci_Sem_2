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
	
	int a = rand.nextInt(1000) + 1;
	
	if (a == number)
	{
		System.out.println("Your number was the random number!");
	}
	else
	{
		System.out.println("Your number wasn't the random number. The number was " + a + ".");
	}
	}
}
