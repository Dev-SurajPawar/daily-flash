/*
Program 4: Write a Program to Print following Pattern
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
*/

import java.util.*;

class Pattern{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num= sc.nextInt();

		int x=1;

		for(int row=1; row<=num; row++)
		{

		
			for(int colm=1; colm<=num; colm++){
			
				System.out.print(x+" ");
				x++;
			}
				System.out.println();

		}
	}
}
