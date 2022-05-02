/*
Program 5: Write a Program to Find Maximum between three numbers
*/

import java.util.*;

class MaximumNumber {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 1st Number: ");
		int x = sc.nextInt();

		System.out.println("Enter 2nd Number: ");
		int y = sc.nextInt();

		System.out.println("Enter 3rd Number: ");
		int z = sc.nextInt();

		if (x>y && x>z)
			System.out.println(x+" is Max number among "+x+" "+y+" "+z);

		else if (y>x && y>z)
			System.out.println(y+" is Max number among "+x+" "+y+" "+z);
		
		else
			System.out.println(z+" is Max number among "+x+" "+y+" "+z);
	}
}

/*
Input: 1 4 2
Output: 4 is Max number among 1 4 2
*/
