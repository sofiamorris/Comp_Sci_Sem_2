import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word.");
		String a = sc.nextLine();
		System.out.println("Letter by letter:");
		int i = 0;
		while (i < a.length())
		{
			System.out.println(i + " " + a.substring(i,(i + 1)));
			i++;
		}
		


		
	}
}
