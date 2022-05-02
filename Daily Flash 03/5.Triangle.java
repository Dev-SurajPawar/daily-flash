/*
Program 5: Write a Program that takes angles of a triangle from the user and
print whether that triangle is valid or not.
{Note: Addition of angles of triangle has to be 180 in order to consider it as a
valid one}
*/

import java.util.*;

class Triangle {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 1st angle: ");
		int x = sc.nextInt();

		System.out.println("Enter 2nd angle: ");
		int y = sc.nextInt();

		System.out.println("Enter 3rd angle: ");
		int z = sc.nextInt();

		if(x+y+z==180)
			System.out.println("The triangle with angles "+ x +" "+ y + " & "+ z +" is a valid one");

		else
			System.out.println("The triangle with angles "+ x +" "+ y + " & "+ z +" is a invalid one");
	}
}

/*
Input: 30 60 70
Output: The triangle with angles 30 60 & 70 is a invalid one
*/
