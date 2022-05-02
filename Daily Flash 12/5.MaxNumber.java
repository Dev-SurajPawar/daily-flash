/*
Program 5: Write a Program that accepts Three integers from the user
and prints a minimum number from them.
*/

import java.util.*;

class Max_Three {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 1st Number: ");
		int x = sc.nextInt();

		System.out.println("Enter 2nd Number: ");
		int y = sc.nextInt();

		System.out.println("Enter 3rd Number: ");
		int z = sc.nextInt();

		if (x>y && x>z)
			System.out.println("The Max number amongst "+x+" "+y+" & "+z+" is "+x);

		else if (y>x && y>z)
			System.out.println("The Max number amongst "+x+" "+y+" & "+z+" is "+y);
		
		else
			System.out.println("The Max number amongst "+x+" "+y+" & "+z+" is "+z);
	}
}

/*
Input: 56
7
99
Output: The Minimum num ber amongst 56 7 & 99 is 7
*/
