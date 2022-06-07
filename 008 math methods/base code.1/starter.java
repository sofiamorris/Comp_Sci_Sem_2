import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		
		int maximum = Math.max(13-6*11,30%7*(-2));
		double root = Math.sqrt(3*8+31%7); 
		double power = Math.pow(37/3,35%21); 
		double max = Math.max(Math.pow(2,14%3),Math.sqrt(2%6));
	
		
		System.out.println("Maximum = " + maximum);
		System.out.println("Square root = " + root);
		System.out.println("Power = " + power);
		System.out.println("Max = " + max);
		
		System.out.print("\nPlease enter a double: ");
		double first = sc.nextDouble();
		
		System.out.print("Please enter another double: ");
		double another = sc.nextDouble();
		
		System.out.println("\nMaximum number of x and y is: " + Math.max(first, another));
		System.out.println("Square root of y is: " + Math.sqrt(another));
		System.out.println("Power of x and y is: " + Math.pow(first, another));
	}
}
