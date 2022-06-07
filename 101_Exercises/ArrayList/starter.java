import java.util.*;

class starter {
	public static void printArrayList(ArrayList<Integer> arr){
		for(int c = 0; c < arr.size(); c++){
			System.out.println(arr.get(c));
		}
		return;
	}
	public static void addValuesArrayList(int n, ArrayList<Integer> arr){
		Random rand = new Random();
		for(int c = 0; c < n; c++){
			int x = (int)(Math.random() * 99) + 1;
			arr.add(c,x);
		}
		return;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many values would you like to add to the array list? ");
		int a = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<Integer>(a);
		addValuesArrayList(a,arr);
		printArrayList(arr);


	}
}
