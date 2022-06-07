import java.util.Scanner;
import java.util.Random;

class starter {

	public static void main(String args[]) {
	Random rand = new Random();
	int a[] = new int[20];
	int b = rand.nextInt(10) + 1;
	int x = 0;
	int y;
	int z;
	int n;
	for(int i = 0; i < 20; i++){
		a[i] = rand.nextInt(10) + 1;
		}
	System.out.println("-----------------------------------------------");
	System.out.println("These are the 20 numbers");
	for(int i = 0; i < 20; i++){
		System.out.print(a[i] + " ");
	}
	System.out.println("\n-----------------------------------------------");
	System.out.println("The random number to look for is " + b);
	for(int i = 0; i < 20; i++){
		if (a[i] == b){
			x++;
			y = i;
			System.out.println("Duplicate found at index " + y);
		}
	}
	System.out.println("Total number of duplicates for " + b + " is " + x);
	System.out.println("-----------------------------------------------");
	System.out.println("Looking for two in a row:");
	for(int i = 1; i < 20; i++){
		z = a[i];
		n = a[i - 1];
		if(z == n){
			System.out.println("Two in a row found at indexes " + (i - 1) + " and " + i + ". The number is " + z);
		}
	}
	}
}
