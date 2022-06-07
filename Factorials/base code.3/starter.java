import java.util.Scanner;

class starter {
	public static int fact(int c) {
		int b = c;
		int a = b - 1;
		while (true)
		{
			System.out.println(b);
			b = b * a;
			if (a == 1)
			{
				return b;
			}
			a = a - 1;
		}
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Input a number: ");
		int b = sc.nextInt();
		System.out.println(fact(b));
	}
}
