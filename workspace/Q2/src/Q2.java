
// Q2 Assignment
// Author: Ian Arcuri
// Date: Sep 9, 2014
// Class: CS160
// Email: arcuri.ian@gmail.com

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		
Scanner keyboard = new Scanner(System.in);
		
	String myString0;
	String myString1;	
	char myCharacter;
	int myInteger;
	double myDouble;
		
	System.out.print("String: "); 
	myString0 = keyboard.nextLine();
	
	System.out.print("String: "); 
	myString1 = keyboard.next();
	
	System.out.print("Character: ");
	String temp = keyboard.next();
	myCharacter = temp.charAt(0);
	
	System.out.print("Integer: ");
	myInteger = keyboard.nextInt();
	
	System.out.print("Double: ");
	myDouble = keyboard.nextDouble();
	
	System.out.println(myString0 +";"+ myString1 +";"+ myCharacter +";"+ myInteger +";"+ myDouble);
	System.out.printf("%.4f\n", ((myInteger + 3.5)/myDouble));
	
	System.out.println(myString0.toLowerCase());
	System.out.println(myString0.length() + "," + myString1.length());
	System.out.println(myString1.indexOf('m'));
	System.out.println(myString1.charAt(1) + "." + myString1.charAt(4));
	System.out.println(myString1.substring(1, 7));
	
	keyboard.close();
	
	
	}

}
