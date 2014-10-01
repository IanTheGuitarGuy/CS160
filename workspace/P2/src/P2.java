// P2 Assignment
// Author: Ian Arcuri
// Date: Sep 8, 2014
// Class: CS160
// Email: arcuri.ian@gmail.com
public class P2 {

	public static void main(String[] args) {
	
	byte a = 28;
	short b = 12345;
	int c = 775533;
	long d = (long) 6269876024L;
	
	float e = (float) 9.345;
	double f = 77.5331;
	
	char g = '*',
	     h = 'Z',
	     i = '8';
	
	String j = "Computer";
	String k = "Science";
	String l = "Super";
	
	System.out.print(a);
	System.out.print(";" + b);
	System.out.print(";" + c);
	System.out.print(";" + d);
	
	System.out.print("\n" + e);
	System.out.print("," + f);
	
	System.out.println("\n" + (a+b+c+d)/999999);
	
	System.out.printf("%.4f\n", Math.sqrt(e*f));
	System.out.printf("%.6f", a/e); 
	
	System.out.print("\n" + g);
	System.out.print("-" + h);
	System.out.print("-" + i);
	
	System.out.print("\n" + ("(")); //Subtracting from characters?
	System.out.print("~" + ("X"));
	System.out.print("~" + ("6"));
	
	System.out.print("\n" + j + " " + k + " is " + l + "!!!");
	
	System.out.print("\n" + j.length());
	System.out.print("," + k.length());
	System.out.print("," + l.length());
	
	System.out.print("\n" + k.toUpperCase());
	System.out.print("\n" + "ompute"); //Print 2nd-7th characters?
	System.out.print("\n" + k.indexOf('n'));
	System.out.print("\n" + l.charAt(2));		
	}

}
