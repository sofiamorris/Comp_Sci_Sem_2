import java.util.*;

class starter {
	public static void bubbleSort(ArrayList<Integer> arr){
		int outer, inner, temp;
		for(outer = 0; outer < arr.size() - 1; outer++){
			for(inner = 0; inner < arr.size() - outer - 1; inner++){
				if(arr.get(inner) > arr.get(inner + 1)){
					temp = arr.get(inner);
					arr.set(inner, arr.get(inner + 1));
					arr.set(inner + 1, temp);
				}
			}
		}
	}
	public static void selectionSort(ArrayList<Integer> arr){
		int outer, inner, min_index, temp;
		for(outer = 0; outer < arr.size(); outer++){
			min_index = outer;
			for(inner = outer + 1; inner < arr.size(); inner++){
				if(arr.get(inner) < arr.get(min_index)){
					min_index = inner;
				}
			}
			temp = arr.get(outer);
			arr.set(outer, arr.get(min_index));
			arr.set(min_index, temp);
		}	
	}
	public static void insertionSort(ArrayList<Integer> arr, int n){
		int outer, inner, key;
		for(outer = 1; outer < n; outer++){
			key = arr.get(outer);
			inner = outer - 1;
			while(inner >= 0 && arr.get(inner) > key){
				arr.set(inner + 1, arr.get(inner));
				inner = inner - 1;
			}
			arr.set(inner + 1, key);
		}
	}
	public static void main(String args[]) {
		Random rand = new Random();
		ArrayList<Integer> arr = new ArrayList<Integer>(100);
		for(int x = 0; x < 100; x++){
			int y = (int)(Math.random()*100);
			arr.add(x,y);
		}
		ArrayList<Integer> arr2 = new ArrayList<Integer>(100);
		arr2 = arr;
		ArrayList<Integer> arr3 = new ArrayList<Integer>(100);
		arr3 = arr;
		System.out.println(arr);
		bubbleSort(arr);
		System.out.println();
		System.out.println(arr);
		System.out.println();
		selectionSort(arr2);
		System.out.println(arr2);
		System.out.println();
		insertionSort(arr3, 100);
		System.out.println(arr3);
		System.out.println();
		System.out.println((arr.get(50) + arr.get(51))/2);
	}
}
