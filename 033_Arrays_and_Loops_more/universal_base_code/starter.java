import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Random rand = new Random();
		int[] number = new int [100];
		System.out.println("There are " + number.length + " elements.");
		int max = 0;
		int min = 1000;
		int i = 0;
		int a = 0;
		while(i < number.length){
			number[i] = rand.nextInt(100) + 1;
			a = a + number[i];
			i++;
		}
		i = 0;
		while(i < number.length){
			if(number[i] > max){
				max = number[i];
			}
			i++;
		}
		System.out.println("The maximum of 100 random numbers is: " + max);
		i = 0;
		while(i < number.length){
			if(number[i] < min){
				min = number[i];
			}
			i++;
		}
		System.out.println("The minimum of 100 random numbers is: " + min);
		int ave = (a/100);
		System.out.println("The average of 100 random numbers is: " + ave);


		
	}
}
