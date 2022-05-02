/*
Program 4: Write a Program to Print following Pattern
1 1 1 1
1 1 1 1
1 1 1 1
1 1 1 1
*/

import java.util.*;

class Pattern{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num= sc.nextInt();

		for(int row=1; row<=num; row++)
		{

			for(int colm=1; colm<=num; colm++){
			
				System.out.print("1 ");
			}
				System.out.println();
		}
	}
}
