import java.util.Scanner;
import java.util.Random;

class starter {
	
	public static void toString(String a, String b){
		System.out.println(a);
		System.out.println(b);
		return;
	}
	public static void toStringCombined(String a, String b){
		System.out.print(a);
		System.out.print(" " + b);
		return;
	}
	
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.println("Write a sentence: ");
		String a = sc.nextLine();
		System.out.println("\nWrite a sentence: ");
		String b = sc.nextLine();
		System.out.println("\nThis is using the methods!");
		toString(a,b);
		toStringCombined(a,b);


	}
}
