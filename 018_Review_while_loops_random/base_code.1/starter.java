import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		int a;
		int b = rand.nextInt(1001);
		int c = 0;
		while (true)
		{
			System.out.print("\nGuess a number: ");
			a = sc.nextInt();
			if (a<b)
			{
				System.out.println("You're a little too low!");
			}
			if (a>b)
			{
				System.out.println("You're a little too high!");
			}
			if (a==b)
			{
				System.out.println("You guessed it!");
				break;
			}
		c = c + 1;
		}

	}
}
