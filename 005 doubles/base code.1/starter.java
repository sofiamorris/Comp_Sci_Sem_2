class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.println((3+4+4+4+3)/5);
		System.out.println((3.0+4.0+4.0+4.0+3.0)/5.0);
		
		double a;
		double b;
		double c;
		double d;
		a = 1.0;
		b = 3.0;
		c = 10.0;
		d = a + b + c;
		System.out.println(d);
		d = d+ a + b + c;
		System.out.println(d);
		
		System.out.print("The Celsius value for 32.0 degrees Farenheit is ");
		double F;
		double C;
		F = 32;
		C = (F-32)*5/9;
		System.out.print(C);
		System.out.print(" degrees.");
	}
}
