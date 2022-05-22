/*
Write a Program to Print following Pattern.
5 4 3 2 1
4 3 2 1
3 2 1
2 1
1
*/

import java.util.Scanner;

class Pattern{

	public static void main(String[] args){

		System.out.println("Enter Number of Rows and Colms: ");

		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();

		for(int i=1; i<=row ;i++)
		{
			int num=row+1-i;
			for(int space=1; space<i; space++)
			{
				System.out.print(" "+" ");
			}
			for(int j=1; j<=row-i+1; j++)
			{
				System.out.print(num+" ");
				num--;
			}
			System.out.println();
		}
	}
}
