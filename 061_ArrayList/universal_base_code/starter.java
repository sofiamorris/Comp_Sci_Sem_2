import pkg.*;
import java.util.Scanner;
import java.util.Random;
import java.util.*;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		ArrayList<String> arr = new ArrayList<String>();
		System.out.println("How many cookies do you want? ");
		int a = sc.nextInt();
		for(int x = 0; x < a; x++){
			arr.add(x, "Cookies");
			System.out.println(arr.get(x));
		}

	}
}
