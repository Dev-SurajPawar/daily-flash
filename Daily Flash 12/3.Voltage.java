/*
Program 3: Write a Program to Implement Ohm's Law.
{Note: V = I*R, where, v is voltage, I is current & R is resistance}
*/

import java.util.Scanner;

class Voltage {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Current: ");
		int i = sc.nextInt();

		System.out.println("Resistance: ");
		int r = sc.nextInt();

			System.out.println("Voltage V = "+(i*r));

	}
}

/*
Input:
I = 10 amp
R = 5
Output: Voltage V = 50.
*/

