/*
Program 4: Write a Program to Print following Pattern.
+ = + =
+ = +
+ =
+
*/

import java.util.Scanner;

class Pattern{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = sc.nextInt();

		for(int i = 1 ; i<=num; i++)
		{
			for(int j = num; j>=i; j--)
			{
				if(j%2!=0)
					System.out.print("= ");
				else
					System.out.print("+ ");

			}

			System.out.println();
		}
	}
}
