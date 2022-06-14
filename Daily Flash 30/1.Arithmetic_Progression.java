/* Write a Program to print an Arithmetic Progression (A.P.)
series. Take Starting element, Total count of elements in A.P. & the
Common Difference from user.
{Note: an AP (i.e. Arithmetic Progression is a series which has a
common difference between every consecutive element. The AP of
common difference 2 starting from 20 can be: 20, 22, 24, 26 . . .}  */

import java.util.Scanner;

class Arithmetic_Progression{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Starting Element: ");
		int start = sc.nextInt();
		System.out.print("Number of Elements: ");
		int num = sc.nextInt();
		System.out.print("Common Difference: ");
		int diff = sc.nextInt();

		int x=1;
		for(int i=1; i<=num; i++)
		{
			System.out.print(x+" ");
			x=x+diff;
		}

	}
}

/*
Starting Element: 1
Number of Elements: 5
Common Difference: 6
1 7 13 19 25 
*/
