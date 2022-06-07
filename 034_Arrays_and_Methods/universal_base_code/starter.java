import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {

	public static void toStringArray(int[] a){
		int i = 0;
		while(i < a.length){
			System.out.print(a[i] + " ");
			i++;
		}
		return;
	}
	public static int getArrayAverage(int[] b){
		int i = 0;
		int e = 0;
		while(i < b.length){
			e = (e + b[i]);
			i++;
		}
		int ave = (e/100);
		return ave;
	}
	public static int getArrayMax(int[] c){
		int i = 0;
		int max = 0;
		while(i < c.length){
			if(c[i] > max){
				max = c[i];
			}
			i++;
		}
		return max;
	}
	public static int getArrayMin(int[] d){
		int i = 0;
		int min = 1000;
		while (i < d.length){
			if(d[i] < min){
				min = d[i];
			}
			i++;
		}
		return min;
	}
	public static void main(String args[]) {
		int[] number = new int [100];
		Random rand = new Random();
		int i = 0;
		while(i < 100){
			number[i] = rand.nextInt(100) + 1;
			i++;
		}
		toStringArray(number);
		System.out.println("\nThe maximum of 100 random numbers is: " + getArrayMax(number));
		System.out.println("The minimum of 100 random numbers is: " + getArrayMin(number));
		System.out.println("The average of 100 random numbers is: " + getArrayAverage(number));
	}
}
