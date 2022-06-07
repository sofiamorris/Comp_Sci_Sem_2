class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		int a;
		int b;
		int c;
		int d;
		
		a = 4;
		b = 3;
		c = a*b;
		d = a + b;
		
		int ans1;
		int ans2;
		int ans3;
		int ans4;
		
		ans1 = (c * d % a + b);
		ans2 = (((-a) + d) % c);
		ans3 = (((a / b) * c) - d);
		ans4 = (((-a) - (-b))*(c % d) + a);
		
		System.out.println(ans1);
		System.out.println(ans2);
		System.out.println(ans3);
		System.out.println(ans4);
	}
}
