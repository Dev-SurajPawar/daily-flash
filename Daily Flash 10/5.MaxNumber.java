/*
Program 5: Write a Program that accepts Two integers from the user
and prints the maximum number from them.
*/

import java.util.Scanner;

class MaximumNumber {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 1st Number: ");
		int x = sc.nextInt();

		System.out.println("Enter 2nd Number: ");
		int y = sc.nextInt();

		if (x>y)
			System.out.println("The Maximum number amongst "+x+" & "+y+" is "+x);

		else
			System.out.println("The Maximum number amongst "+x+" & "+y+" is "+y);

	}
}

/*
Input: 56 99
Output: The Maximum number amongst 56 & 99 is 99
*/
