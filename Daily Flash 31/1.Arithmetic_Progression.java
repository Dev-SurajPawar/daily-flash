/*  Write a Program that prints Sum an Arithmetic Progression (A.P.)
series. Take Starting element, Total count of elements in A.P. & the Common
Difference from user.  */

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

		int sum = 0; int x=1;
		for(int i=1; i<=num; i++)
		{
			System.out.print(x+"+");
			sum=sum+x;
			x=x+diff;
		}

		System.out.print("="+sum);
	}
}

/*
Starting Element: 1
Number of Elements: 8
Common Difference: 5
1+6+11+16+21+26+31+36+=148
*/
