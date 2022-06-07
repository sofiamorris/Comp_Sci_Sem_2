package pkg;
import java.util.Scanner;
import java.util.Random;


public class HorseBarn {
	private Horse[] spaces; 
	public int findHorseSpace(String name){
		for(int i = 0; i < spaces.length; i++){
			if(name.equals(spaces[i])){
				return i;
			}
		}
		return -1;
	}
	public void consolidate(){
		for(int i = 1; i < spaces.length; i++){
			if(spaces[i-1].equals("null"){
				spaces[i-1] = spaces[i];
				spaces[i] = "null";
			}
		}
	}
}
