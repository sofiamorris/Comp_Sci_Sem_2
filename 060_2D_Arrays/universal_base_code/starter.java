import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void rowAverage(int arr[][]){
		int count = 0;
		int num = 0;
		for(int y = 0; y < arr.length; y++){
			System.out.print("Row " + y + " - ");
			for(int x = 0; x < arr[0].length; x++){
			count = count + arr[y][x];
			num++;
			}
			System.out.println("ave = " + (count/num));
		}
		return;
		
	}
	public static void getAverage(int arr[][]){
		int count = 0;
		int num = 0;
		for(int y = 0; y < arr.length; y++){
			for(int x = 0; x < arr[0].length; x++){
			count = count + arr[y][x];
			num = num + 1;
			}
		}
		System.out.println("ave: " + count / num);
		return;
	}
	public static void printArray(int arr[][]){
		for(int y = 0; y < arr.length; y++){
			for(int x = 0; x < arr[0].length; x++){
				System.out.print(arr[y][x] + " ");
			}
			System.out.println();
		}
		return;
	}
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		System.out.print("What's the width of the array? ");
		int a = sc.nextInt();
		System.out.print("What's the length of the array? ");
		int b = sc.nextInt();
		int [][] arr = new int[b][a];
		for(int y = 0; y < arr.length; y++){
			for(int x = 0; x < arr[0].length; x++){
				arr[y][x] = (int)(Math.random()*9) + 1;
			}
		}
		rowAverage(arr);
		getAverage(arr);
		printArray(arr);

		
	}
}
