import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	
	public int getMode(int[] a){
		int mode;
		if (a.length() > 0){
			for (int i = 0; i < a.length() - 2; i++){
				if (a[i].substring(i,i+1) == a[i].substring(i+1,i+2){
					mode = i;
				}
			}
			return mode;
		}
		else{
			int b = -1;
			return b;
		}
		}
	pubic double getMedian(int[] b){
		int[] array = new Int[b.length];
		int order = 0;
		if (b.length() > 0){
			for (int i = 0; i < b.length(); i++){
				int min = 10;
				while (i < b.length){
					if(b[i] < min){
						min = array[order];
						order++;
					}
				i++;
				}
		int d = array.length()/2;
		double median = (array[d] + array[d+1])/2;
		return median;
		}
	}
	
	public static void main(String args[]) {
		// Your code goes below here
		


		
	}
}
