/*
Program 2: Write a Program which accepts two integers from the user
and swaps their insertion order.
*/

import java.util.Scanner;

class Swap {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 1st Number: ");
		int x = sc.nextInt();

		System.out.println("Enter 2nd Number: ");
		int y = sc.nextInt();

		int temp =x;
		x = y;

		System.out.println(x+" "+temp);

	}
}

/*
Input : 20 30
Output :
Before Swap : 20 30
After Swap : 30 20
*/
