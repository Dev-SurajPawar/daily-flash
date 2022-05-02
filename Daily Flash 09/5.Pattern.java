/*
Program 5: Write a Program to print following Pattern.
Take no of rows from user
Output:
*
$ $
* * *
$ $ $ $
*/

import java.util.Scanner;

class Pattern{


	public static void main(String[] args){

		System.out.println("Enter Number: ");

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		for(int i=1; i<=num; i++) 
		{
			if(i%2==0)
				for(int j=1; j<=i; j++)
					System.out.print("$ ");
			else
				for(int j=1; j<=i; j++)
					System.out.print("* ");

			System.out.println();
		}
	}
}
