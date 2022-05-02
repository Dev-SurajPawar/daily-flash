/*
Program 1: Write a Program to take all three sides of a triangle from the user
and check whether the triangle satisfies the Pythagorean Theorem.
*/

import java.util.*;

class Pytha_Theorem {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 1st Side: ");
		int x = sc.nextInt();

		System.out.println("Enter 2nd Side: ");
		int y = sc.nextInt();

		System.out.println("Enter Hypotenuse: ");
		int z = sc.nextInt();

		if ((x^2)+(y^2)==(z^2))
			System.out.println("Triangle Satisfies the Pythagorean Theorem");

		else
			System.out.println("Triangle Not Satisfies the Pythagorean Theorem");

	}
			
}

/*
Input:
Side 1 = 3
Side 2 = 4
Hypotenuse = 5
Output: Triangle Satisfies the Pythagorean Theorem
*/
