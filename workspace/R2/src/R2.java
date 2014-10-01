import java.util.Scanner;

// R2 Assignment
// Author: Ian Arcuri
// Date: Sep 2, 2014
// Class: CS160
// Email: arcuri.ian@gmail.com
public class R2 {

	public static void main(String[] args) {
		//System.out.println(12+7);
		//System.out.println(12/7);
		//System.out.println(12.0/7.0);
		//System.out.println(12.0/7);
		//System.out.println(12%7);
		//System.out.println(3-7*6);
		//System.out.println((3-7)*6);
		//System.out.println(0.1+0.2-0.3);
		

		//String myString = "Ian Arcuri";
		//System.out.println(myString.length());
		//System.out.println(myString.indexOf('a'));
		//System.out.println(myString.charAt(0));
		//System.out.println(myString.substring(0, myString.length()));
		//System.out.println(myString.toUpperCase());
		//System.out.println(myString.toLowerCase());
	
		//Scanner
		//Scanner keyboard = new Scanner (System.in);
		//int i = 0;
		//i = keyboard.nextInt();
		//double d = 0.0;
		//d = keyboard.nextDouble();

		//System.out.printf("You Entered: %.2f %n", d);
		
		//keyboard.close();
		

		Scanner scan = new Scanner(System.in);
		
		int i = 0;
		double d = 0.0;
		
		System.out.print("Enter an integer: ");
		i = scan.nextInt();
		System.out.println("You entered: " + i);
		
		System.out.print("Now enter a double: ");
		d = scan.nextDouble();
		System.out.printf("Now you entered: %.2f\n", d);
		
		scan.close();
		
		String myString = "Bazinga";
		System.out.println(myString.length());
		System.out.println(myString.charAt(2));
		System.out.println(myString.indexOf('z'));
		System.out.println(myString.toUpperCase());
		
								
	}

}
