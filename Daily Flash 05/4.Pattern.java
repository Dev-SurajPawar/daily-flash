/*
Program 4: Write a Program to Print following Pattern
2 4 6 8
2 4 6 8
2 4 6 8
2 4 6 8
*/

import java.util.*;

class Pattern{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num= sc.nextInt();

		for(int row=1; row<=num; row++)
		{

			int x=1;

			for(int colm=1; colm<=num; colm++){
			
				System.out.print(x*2+" ");
				x++;
			}
				System.out.println();
		}
	}
}
