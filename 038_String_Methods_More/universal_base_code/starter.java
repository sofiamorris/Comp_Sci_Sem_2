import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a first name and last name with a space in the middle.");
		String a = sc.nextLine();
		int b = a.indexOf(" ");
		System.out.println("The last name is: " + a.substring(b + 1));

		
	}
}
