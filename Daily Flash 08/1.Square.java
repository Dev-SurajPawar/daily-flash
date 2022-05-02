/*
Program 1: Write a program to print squares of the first 10 numbers.
*/

import java.util.Scanner;

class Square {

	public static void main(String[] args){
	
	
		System.out.println("Enter Number: ");

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		for(int i=1; i<=num; i++)
			System.out.println("Square of " + i + ": "+(i*i));
	}
}

/*
Output:
Square of 1: 1
Square of 2: 4
Square of 3: 9
.
.
.
Square of 10: 100
*/
