/*
Program 4: Write a Program to Print following Pattern.
7
7 6
7 6 5
7 6 5 4
*/

import java.util.Scanner;

class Pattern{


	public static void main(String[] args){

		System.out.println("Enter Number: ");

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		for(int i=num; i>=0; i--) 
		{	
			int x = 7;
			
			for(int j=i; j<=num; j++)
			{
				System.out.print(x+" ");
				x--;
			}
				
			System.out.println();
		}
	}
}
