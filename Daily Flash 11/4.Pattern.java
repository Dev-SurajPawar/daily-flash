/*
Program 4: Write a Program to Print following Pattern.
1
4  9 
16 25 36
48 64 81 100
*/

import java.util.Scanner;

class Pattern{


	public static void main(String[] args){

		System.out.println("Enter Number: ");

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int x = 1;
		for(int i=1; i<=num; i++) 
		{	
			for(int j=1; j<=i; j++)
			{

				System.out.print(x*x+" ");
				x++;
			}
				
			System.out.println();
		}
	}
}
