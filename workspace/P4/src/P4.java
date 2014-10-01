// P4 Assignment
// Author: Ian Arcuri
// Date: Sep 22, 2014
// Class: CS160
// Email: arcuri.ian@gmail.com

import java.util.Scanner;

public class P4 {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		float Gross;
		System.out.print("Gross Salary: ");
		Gross = keyboard.nextFloat();

		int Exemptions;
		System.out.print("Number of Exemptions: ");
		Exemptions = keyboard.nextInt();

		float Interest;
		System.out.print("Interest Income: ");
		Interest = keyboard.nextFloat();

		float Capital;
		System.out.print("Capital Gains: ");
		Capital = keyboard.nextFloat();

		float Total = (Gross + Interest + Capital);
		System.out.printf("Total Income: $%.2f\n", Total);

		float Adjusted = (float) (Total - (Exemptions * 1800.00));
		System.out.printf("Adjusted Income: $%.2f\n", Adjusted);

		if ((Adjusted > 0) && (Adjusted <= 10000)) {
			System.out.printf("Total Tax: $%.2f\n", ((0.00 * (Adjusted))));
		} else if ((Adjusted > 10000) && (Adjusted <= 25000)) {
			System.out.printf("Total Tax: $%.2f\n",
					((0.15 * (Adjusted - 250000.00))));
		} else if ((Adjusted > 25000) && (Adjusted <= 36000)) {
			System.out
					.printf("Total Tax: $%.2f\n",
							(((0.25 * (Adjusted - 25000.00)) + (0.15 * (25000.00 - 10000.00)))));
		} else if (Adjusted > 36000) {
			System.out
					.printf("Total Tax: $%.2f\n",
							(((0.28 * (Adjusted - 36000.00))) + ((0.25 * (36000.00 - 25000.00)) + (0.15 * (25000.00 - 10000.00)))));
		}

		System.out.printf("State Tax: $%.2f\n", (Adjusted * .06));

		keyboard.close();

	}

}
