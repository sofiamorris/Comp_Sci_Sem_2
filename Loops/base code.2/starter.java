import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Input a number: ");
		int a = sc.nextInt();
		int c = 0;
		while (true)
		{
			System.out.println(a + c);
			if (c>3)
			{
				break;
			}
			c = c + 1;
		}
	}
}
