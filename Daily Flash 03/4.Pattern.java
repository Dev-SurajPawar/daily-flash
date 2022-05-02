/*
Program 4: Write a Program to Print following Pattern
1 2 3 4
1 2 3 4
1 2 3 4
1 2 3 4
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
			
				System.out.print(x+" ");
				x++;
			}
				System.out.println();
		}
	}
}
