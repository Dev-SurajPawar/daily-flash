/*
Program 5: Write a Program to print following Pattern.
Output:
0
1 2
3 4 5
6 7 8 9
*/

import java.util.Scanner;

class Pattern{


	public static void main(String[] args){

		System.out.println("Enter Number: ");

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		for(int i=1; i<=num; i++) {
			
			for(int j=0; j<=i; j++)
			{
				System.out.print(j+" ");
			}

			System.out.println();

		}

	}
}
