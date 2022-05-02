/*
Program 3: Write a Program to Print following Pattern.
A A A A
B B B
C C
D
*/

import java.util.Scanner;

class Pattern{


	public static void main(String[] args){

		System.out.println("Enter Number: ");

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

	     	char ch = 'A';

		for(int i=1; i<=num; i++) 
		{	
			
			for(int j=i; j<=num; j++)
			{
				System.out.print(ch+" ");
		
			}
				
			System.out.println();
			ch++;
		}
	}
}
