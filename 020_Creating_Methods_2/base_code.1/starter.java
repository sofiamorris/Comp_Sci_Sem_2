import java.util.Scanner;
import java.util.Random;

class starter {
	
	public static int pow(int a, int b){
		int c = 0;
		int x = a;
		while (b >= c)
		{
			x = x * a;
			if (c > (b-3))
			{
				break;
			}
			c = c + 1;
		}
		return x;
	}
	
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your base number?");
		int a = sc.nextInt();
		System.out.println("What is your exponent number?");
		int b = sc.nextInt();
		System.out.print("Your answer is: " + pow(a,b));
	}
}
