/*
Program 2: Write a Program to print cube of first 20 numbers.
*/

import java.util.Scanner;

class Cube {

	public static void main(String[] args){
	
	
		System.out.println("Enter Number: ");

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		for(int i=1; i<=num; i++)
			System.out.println("Square of " + i + ": "+(i*i*i));
	}
}

/*
Output:
Cube of 1: 1
Cube of 2: 8
Cube of 3: 27
.
.
.
Cube of 20: 8000
*/
