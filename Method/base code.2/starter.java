import java.util.Scanner;

class starter {
	public static int mult(int a, int b){
		int x = a;
		int y = b;
		int multiply = (x*y);
		if (multiply % 3 == 0)
		{
			System.out.print(multiply + " is divisible by 3");
		}
		else
		{
			System.out.print(multiply + " is not divisible by 3");
		}
		return multiply;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input a number: ");
		int a = sc.nextInt();
		System.out.print("Input another number: ");
		int b = sc.nextInt();
		int c = mult(a,b);
	}
}
