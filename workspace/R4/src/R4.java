import java.util.Scanner;

// R4 Assignment
// Author: Ian Arcuri
// Date: Sep 18, 2014
// Class: CS160
// Email: arcuri.ian@gmail.com
public class R4 {

	public static void main(String[] args) {

	//Bonus problem is worked out below all commented text
		
		//Part 1a: Experimenting with if
		
		/*Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter your age: ");
		int age = keyboard.nextInt();*/
		
/*      if (age > 20) // no semicolon here!!!
		{
			System.out.println("You can legally buy and consume alcohol in the USA.");
		}

		keyboard.close(); // not necessary, but good practice
		System.out.println("End of program.");*/
		
		
		
		//Part 1b: Same thing, streamlined
		
/*		if (age >= 21) 
		{
			System.out.println("You can legally buy and consume alcohol in the USA.");
		}		

		keyboard.close();
		System.out.println("End of program.");*/
		
		
		
		//Part 2: More with if
		
/*		if (age == 21) 
		{
			System.out.println("Wow!  You are 21 years old!");
		}		

		if (age != 21) 
		{
			System.out.println("Interesting!  You are NOT 21 years old!");
		}	

		keyboard.close();
		System.out.println("End of program.");*/
		
		
		
		//Part 3a: if... else...
		
/*		if (age == 21) 
		{
			System.out.println("Wow!  You are 21 years old!");
		}
		else
		{
			System.out.println("Interesting!  You are NOT 21 years old!");
		}		

		System.out.println("End of program.");*/
		
		
		//Part 3b: if... else... applied to legal drinking age
		
		/*if (age >= 21) 
		{
			System.out.println("You can legally buy and consume alcohol in the USA.");
		}
		else
		{
			System.out.println("You are under 21 and cannot legally buy and consume alcohol in the USA.");
		}		

		System.out.println("End of program.");*/
		
		

		//Part 4a: if... else if...
		
		/*if (age == 21) 
		{
			System.out.println("Boom!  You are 21!");
		}
		else if (age == 18)
		{
			System.out.println("Hey-o!  You're 18 years old!");
		}		

		System.out.println("End of program.");*/
		
		
		
		//Part 4b: as many else if's as we want
		
/*	    if (age == 21) 
		{
			System.out.println("You are 21 and the same age as Miley Cyrus!  Not sure if that's good or bad.");
		}
		else if (age == 18)
		{
			System.out.println("You're 18 years old! and the same age as Zendaya.  No idea who she was -- I had to Google her.");
		}	
		else if (age == 20)
		{
			System.out.println("You're 20 years old and the same age as Justin Bieber!  Has he retired yet?");
		}	
		else if (age == 16)
		{
			System.out.println("You're 16 years old and the same age as Jaden 'Don't call me Will' Smith!");
		}		

		System.out.println("End of program.");*/
		
		
		
		//Part 5: Bring it together
		
/*		if (age == 21) 
		{
			System.out.println("You are 21 and the same age as Miley Cyrus!  Not sure if that's good or bad.");
		}
		else if (age == 18)
		{
			System.out.println("You're 18 years old! and the same age as Zendaya.  No idea who she was -- I had to Google her.");
		}	
		else if (age == 20)
		{
			System.out.println("You're 20 years old and the same age as Justin Bieber!  Has he retired yet?");
		}	
		else if (age == 16)
		{
			System.out.println("You're 16 years old and the same age as Jaden 'Don't call me Will' Smith!");
		}
		else
		{
			System.out.println("Oops! You're not the age of any people I know.");
		}		

		System.out.println("End of program.");*/
		
		
		
		//Part 6a: Question to solve
		
		//does this code have a problem? ANS: We can shorten this code by combining the two if statements. 
		/*boolean canDrive;

		if (age >= 16) 
		{
			canDrive = true;
		}	


		if (canDrive == true)
		{
			System.out.println("According to our records, you can legally drive a car in the USA.");
		}
		else
		{
			System.out.println("According to our records, you are prohibited from driving a car in the USA.");
		}

		System.out.println("End of program.");*/
		
		
		
		//Part 6b: Question to solve
		
		//**Q: How could you rewrite this so that if the user enters 22, both facts are printed?*
		/*if (age >= 21) 
		{
			System.out.println("You can legally buy and consume alcohol in the USA.");
		}
		**else** if (age >= 18)  //**ANS: remove the else from the else if command.**
		{
			System.out.println("Can legally drive a car in the USA.");
		}	
		else 
		{
			System.out.println("You're under 18 years old.");
		}

		System.out.println("End of program.");*/

		
		
		//Part 7: Getting even more control with && and || (logical AND and OR)
		
		//now we're going to slightly change our program to do something else:
/*	    if ( (age > 11) && (age < 20) ) // the extra parentheses help readability, but aren't necessary...
		{
			System.out.println("You are a teenager!");
		}
		else if (age > 100 || age < 2) // ...as demonstrated here
		{
			System.out.println("You are either Gandalf or learning to walk.");
		}	
		else 
		{
			System.out.println("I have nothing interesting to say.");
		}
	    
	    keyboard.close();
		System.out.println("End of program.");*/
		
		
		
		
		
		//Bonus Part
		
	Scanner keyboard = new Scanner(System.in);
	System.out.print("Please enter a full name: ");
	String fullName = keyboard.next().toLowerCase();
	
	System.out.print("Is the person happy? (y/n): ");
	char happyAnswer = keyboard.next().toLowerCase().charAt(0);
	boolean isHappy = happyAnswer == 'y';
	
	if ( fullName.equals("indiana jones") == false)
	{
		System.out.println("Dude, suckin' at somethin' is the first step towards bein' sorta good at something.");
	}

	if ( fullName.equals("indiana jones") && isHappy == true)
	{
		System.out.println("Looks like Indy's find ended up in a museum!");
	} 
	else if ( fullName.equals("indiana jones") && isHappy == false)	
	{
		System.out.println("Looks like Indy lost his hat!");
	} 
	
	keyboard.close();
	
	System.out.println("End of program.");
	
	}
}
