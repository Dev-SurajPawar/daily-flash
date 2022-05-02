/*
Program 4: Write a Program to Print following Pattern.
a
A A
a a a
A A A A
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
					System.out.print("A ");
			else
				for(int j=1; j<=i; j++)
					System.out.print("a ");

			System.out.println();
		}


	}
}
