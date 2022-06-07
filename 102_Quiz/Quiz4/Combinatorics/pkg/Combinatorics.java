package pkg;
import java.util.Scanner;
import java.util.Random;


public class Combinatorics {
	public static int factorial(int n){
		int c = 1;
		for(int i = n; i > 0; i--){
			c = i * c;
		}
		return c;
	}
	public static void numCombinations(int n, int r){
		if (r>n){
			System.out.println("There are 0 ways of choosing " + r + " items from " + n + " choices.");
		}
		else{
			int a = factorial(n);
			int b = factorial(r);
			int c = a/(b(factorial(n-r)));
			System.out.println("There are " + c + " ways of choosing " + r + " items from " + n + "choices.");
		}
		
	}
	}

}
