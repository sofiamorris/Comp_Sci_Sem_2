import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence.");
		String a = sc.nextLine();
		int i = 0;
		while (i < a.length()){
			String c = a.substring();
			if (c.equals(" ")){
				int b = a.indexOf(" ", i);
				System.out.print(a.substring(i, b - 1));
			}
		i++;
		}
	}
}
