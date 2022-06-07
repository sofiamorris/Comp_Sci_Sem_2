import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Random rand = new Random();
	int[] number = new int[20];
	int[] reverse = new int[20];
	int i = 0;
	int j = 19;
	while (i <= 19)
	{
		number[i] = rand.nextInt(50) + 1;
		reverse[j] = number[i];
		System.out.println(i + "    " + j);
		i++;
		j--;
	}
	}
}
