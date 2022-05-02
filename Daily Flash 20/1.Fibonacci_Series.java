/*
Program 1: Write a Program to print Fibonacci Series of N elements. Where n is a number entered by the user.
*/

import java.util.Scanner;

class Fibonacci_series{

	public static void main(String[] args){

		System.out.print("Enter Number: ");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int one = 0;
		int two = 1;

		for(int i=1; i<=num; ++i)
		{
			System.out.print(one+" ");
		
			int three = one + two;
			one = two;
			two = three;

		}
	}
}

/*
Output: 0 1 1 2 3 5 8 13 21 34
*/
