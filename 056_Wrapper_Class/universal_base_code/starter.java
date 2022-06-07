import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
	int a = 6;
	char b = 'A';
	double c = 9.8;
	boolean d = true;
	Integer myInt = a;
	Character myChar = b;
	Double myDouble = c;
	Boolean myBoolean = d;
	System.out.println(myInt);
	System.out.println(myChar);
	System.out.println(myDouble);
	System.out.println(myBoolean);
	String as = myInt.toString();
	String ab = myChar.toString();
	String ac = myDouble.toString();
	String ad = myBoolean.toString();
	System.out.println(as.length());
	System.out.println(ab.length());
	System.out.println(ac.length());
	System.out.println(ad.length());
	}
}
