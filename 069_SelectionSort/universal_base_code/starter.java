import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Random rand = new Random();
		int[] arr = new int[200];
		for(int x = 0; x < arr.length; x++){
			arr[x] = (int)(Math.random()*100);
		}
		int outer, inner, min_index;
		for(outer = 0; outer < arr.length; outer++){
			min_index = outer;
			for(inner = outer + 1; inner < arr.length; inner++){
				if(arr[inner] < arr[min_index]){
					min_index = inner;
				}
			int temp = arr[outer];
			arr[outer] = arr[min_index];
			arr[min_index] = temp;
		}
		for(int c = 0; c < arr.length; c++){
			System.out.print(arr[c] + " ");
		}
		
	}
}
}
