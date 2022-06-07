import java.util.*;

class starter {
	public static void removeDup(ArrayList<Integer> arr){
		for(int c = 0; c < arr.size(); c++){
			for(int x = c + 1; x < arr.size(); x++){
				if(arr.get(c) == arr.get(x)){
					arr.remove(x);
					x--;
				}
			}
		}
	}
	
	public static void main(String args[]) {
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		addValuesInt(arr1, 100);
		printValuesInt(arr1);
		System.out.println();
		removeDup(arr1);		//Create this method.
		System.out.println();
		printValuesInt(arr1);
	}

	public static void addValuesInt(ArrayList<Integer> arr, int num){
		for(int i = 0; i < num; i++){
			arr.add((int)(Math.random()*100));
		}
	}

	public static void printValuesInt(ArrayList<Integer> arr){
		for(int i = 0; i < arr.size(); i++){
			System.out.print(arr.get(i) + ", ");
		}
	}
}
