import pkg.*;
import java.util.Scanner;
import java.util.Random;
import java.util.*;


class starter {
	public static void toStringArrayList(ArrayList<Integer> arr){
		for(int c = 0; c < arr.size(); c++){
			System.out.println(arr.get(c));
		}
	}
	public static int getArrayListAverage(ArrayList<Integer> arr){
		int num = 0;
		for(int c = 0; c < arr.size(); c++){
			num = num + arr.get(c);
		}
		int ave = num/arr.size();
		return ave;
	}
	public static int getArrayListMax(ArrayList<Integer> arr){
		int max = arr.get(0);
		for(int c = 0; c < arr.size() - 1; c++){
			if(arr.get(c) < arr.get(c + 1)){
				max = arr.get(c + 1);
			}
		}
		return max;
	}
	public static int getArrayListMin(ArrayList<Integer> arr){
		int min = arr.get(0);
		for(int c = 0; c < arr.size() - 1; c++){
			if(arr.get(c) > arr.get(c + 1)){
				min = arr.get(c + 1);
			}
		}
		return min;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<Integer>();
		System.out.println("How many values do you want in the array list? ");
		int a = sc.nextInt();
		for(int c = 0; c < a; c++){
			int b = (int)((Math.random()) * 99) + 1;
			arr.add(c, b);
		}
		toStringArrayList(arr);
		System.out.println("Average: " + getArrayListAverage(arr));
		System.out.println("Max: " + getArrayListMax(arr));
		System.out.println("Min: " + getArrayListMin(arr));
	}
}
