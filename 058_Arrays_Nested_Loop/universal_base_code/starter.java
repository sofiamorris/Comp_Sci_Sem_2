import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("What symbol would you like to use? ");
		String a = sc.nextLine();
		System.out.print("What's the width of your box? ");
		int b = sc.nextInt();
		System.out.println("What's the height of your box? ");
		int c = sc.nextInt();
		for(int h = 0; h < c; h++){
			System.out.println();
			for(int w = 0; w < b; w++){
				System.out.print(a + " ");
			}
		}

		
	}
}
