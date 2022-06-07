import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		
	Scanner sc = new Scanner (System.in);
	System.out.println("Please input your first number: ");
	int first = sc.nextInt();
	
	System.out.println("Please input your second number: ");
	int second = sc.nextInt();
	
	int x = first;
	int y = second;
	
	if (x != y)
	{
		System.out.println("Your numbers are different!");
	}
	
	if (x == y)
	{
		System.out.println("Your numbers are the same!");
	}
	
	System.out.println("Please enter your first number: ");
	int n1 = sc.nextInt();
	
	System.out.println("Please enter your second number: ");
	int n2 = sc.nextInt();
	
	System.out.println("Please enter your third number: ");
	int n3 = sc.nextInt();
	
	int a = n1;
	int b = n2;
	int c = n3;
	
	if ((a>b) && (a>c))
	{
		System.out.println("Your first number is the largest of the three!");
		System.out.println("The number was " + n1);
	}
	
	if ((b>c) && (b>a))
	{
		System.out.println("Your second number is the largest of the three!");
		System.out.println("The number was " + n2);
	}
	
	if ((c>b) && (c>a))
	{
		System.out.println("Your third number is the largest of the three!");
		System.out.println("The number was " + n3);
	}
	
	if ((a<b) && (a<c))
	{
		System.out.println("Your first number is the smallest of the three!");
		System.out.println("The number was " + n1);
	}
	
	if ((b<c) && (b<a))
	{
		System.out.println("Your second number is the smallest of the three!");
		System.out.println("The number was " + n2);
	}
	
	if ((c<b) && (c<a))
	{
		System.out.println("Your third number is the smallest of the three!");
		System.out.println("The number was " + n3);
	}
	}
}
