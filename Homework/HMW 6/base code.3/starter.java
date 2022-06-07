import java.util.Scanner;

class starter {
	public static boolean checkPrime(int a){
		int x = a;
		int c = 2;
		while (c < x)
		{
			if (x % c == 0)
			{
				return false;
			}
			if (c == x)
			{
				break;
			}
		c = c + 1;
		}
		return true;
	}
	public static void printPrime(int b){
		int num = b;
		int y = 2;
		while (y <= num)
		{
			if (checkPrime(y))
			{
				System.out.println(y);
			}
			if (y == num)
			{
				break;
			}
		y = y + 1;
		}
		return;
	}
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Input a number and we'll print out every prime until that number: ");
	int d = sc.nextInt();
	printPrime(d);
	
	
	}
}
