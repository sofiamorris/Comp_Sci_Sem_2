import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		int [][] arr = new int[3][2];
		arr[0][0] = 5;
		arr[0][1] = 4;
		arr[1][0] = 4;
		arr[1][1] = 3;
		arr[2][0] = 3;
		arr[2][1] = 2;
		Double a = (arr[0][0] + arr[0][1] + arr[1][0] + arr[1][1] + arr[2][0] + arr[2][1])/6.0;
		System.out.print(a);
		
	}
}
