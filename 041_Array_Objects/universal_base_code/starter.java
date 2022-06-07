import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Warrior[] a = new Warrior[100];
		Wizard[] b = new Wizard[100];
		for(int i = 0; i < 100; i++){
			a[i] = new Warrior();
			b[i] = new Wizard();
		}
		int cb = 0;
		int ca = 0;
		while(ca < 100 && cb < 100){
			a[ca].attack(b[cb]);
			if(b[cb].isDead()){
				cb++;
				if(cb==100){
					break;
				}
			}
			b[cb].attack(a[ca]);
			if(a[ca].isDead()){
				ca++;
				if(ca==100){
					break;
				}
			}
		}
		if(cb == 100){
			System.out.print("Warriors won with " + (100 - ca) + " left in their army.");
		}
		if(ca == 100){
			System.out.print("Wizards won with " + (100 - cb) + " left in their army.");
		}
	}
}
