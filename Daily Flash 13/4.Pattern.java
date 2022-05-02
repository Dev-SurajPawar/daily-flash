/*
Program 4: Write a Program to Print following Pattern.
3
2 3
1 2 3
0 1 2 3
*/

import java.util.Scanner;

class Pattern{


	public static void main(String[] args){

		System.out.println("Enter Number: ");

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();


		for(int i=num; i>=0; i--) 
		{	
			for(int j=i; j<=num; j++)
			{
				System.out.print(j+" ");
			}
				
			System.out.println();
		}
	}
}
