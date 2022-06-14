/*  Write a Program to print AP in reverse order take last
Element & Common Difference from user.
{Note: Use While Loop}  */

import java.util.Scanner;

class Arithmetic_Progression{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Last Element: ");
		int last = sc.nextInt();
		System.out.print("Common Difference: ");
		int diff = sc.nextInt();

		while (last>=diff)
		{
			System.out.print(last+" ");
			last=last-diff;
		}
	}
}

/*
Last Element: 40
Common Difference: 8
40 32 24 16 8 
*/
