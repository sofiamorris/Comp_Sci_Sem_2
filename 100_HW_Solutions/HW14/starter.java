import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Thalasiren[] thalasiren = new Thalasiren[10];
		Toad[] toad = new Toad[10];
		for(int i = 0; i < 10; i++){
			thalasiren[i] = new Thalasiren();
			thalasiren[i].trick();
			toad[i] = new Toad();
			toad[i].trick();
		}
		System.out.println();
		Thalasiren Ryan = new Thalasiren();
		Toad Franklin = new Toad(289);
		Thalasiren Ryan3 = new Thalasiren(true);
		Toad Gary = new Toad("Gary");
		Thalasiren Barbara = new Thalasiren("Barbara", true);
		Thalasiren Bertha = new Thalasiren("Bertha", 420, false);
		Toad Renald = new Toad("Renald", 123, true);
		System.out.println();
		Barbara.trick();		
		Bertha.trick();
		Renald.trick();
	}
}