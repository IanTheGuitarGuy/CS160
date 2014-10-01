import java.util.Scanner;

// P3 Assignment
// Author: Ian Arcuri
// Date: Sept 15, 2014
// Class: CS160
// Email: arcuri.ian@gmail.com

public class P3 {

	public static void main(String[] args) {

		double grocery1, grocery2, grocery3, grocery4, grocery5;
		double nonGrocery1, nonGrocery2;
		double totalGrocery, totalNonGrocery;
		double taxGrocery, taxNonGrocery;
		double totalCost, totalTax, grandTotal;

		Scanner keyboard = new Scanner(System.in);

		System.out.print("First grocery item: ");
		grocery1 = keyboard.nextDouble();
		System.out.print("Second grocery item: ");
		grocery2 = keyboard.nextDouble();
		System.out.print("Third grocery item: ");
		grocery3 = keyboard.nextDouble();
		System.out.print("Fourth grocery item: ");
		grocery4 = keyboard.nextDouble();
		System.out.print("Fifth grocery item: ");
		grocery5 = keyboard.nextDouble();

		System.out.print("First non-grocery item: ");
		nonGrocery1 = keyboard.nextDouble();
		System.out.print("Second non-grocery item: ");
		nonGrocery2 = keyboard.nextDouble();

		System.out.print("Total grocery: $");
		System.out.printf("%.2f\n",
				(grocery1 + grocery2 + grocery3 + grocery4 + grocery5));

		System.out.print("Total non-grocery: $");
		System.out.printf("%.2f\n", (nonGrocery1 + nonGrocery2));

		System.out.print("Tax grocery: $");
		System.out.printf("%.2f\n", (0.008 * (grocery1 + grocery2 + grocery3
				+ grocery4 + grocery5)));

		System.out.print("Tax non-grocery: $");
		System.out.printf("%.2f\n", (0.072 * (nonGrocery1 + nonGrocery2)));

		System.out.print("Total cost: $");
		System.out.printf("%.2f\n", (grocery1 + grocery2 + grocery3 + grocery4
				+ grocery5 + nonGrocery1 + nonGrocery2));

		System.out.print("Total tax: $");
		System.out
				.printf("%.2f\n",
						((0.008 * (grocery1 + grocery2 + grocery3 + grocery4 + grocery5)) + (0.072 * (nonGrocery1 + nonGrocery2))));

		System.out.print("Grand total: $");
		System.out
				.printf("%.2f\n",
						((grocery1 + grocery2 + grocery3 + grocery4 + grocery5
								+ nonGrocery1 + nonGrocery2)
								+ (0.008 * (grocery1 + grocery2 + grocery3
										+ grocery4 + grocery5)) + (0.072 * (nonGrocery1 + nonGrocery2))));

		keyboard.close();
	}

}
