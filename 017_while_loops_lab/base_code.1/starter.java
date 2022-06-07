import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter a name: ");
		String name = sc.nextLine();
		System.out.print("How many times would you like this name to be repeated? ");
		int num = sc.nextInt();
		
		int c = 0;
		while(num > c)
		{
			System.out.println(name);
			if (num < c)
			{
				break;
			}
			c = c + 1;
		}



		
	}
}
