/*
Program 4: Write a Program to print First 50 Even Numbers
*/

import java.util.Scanner;

class Even_Number {


	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Max Limit: ");

		int num = sc.nextInt();

			System.out.print("Even Number: ");
			
		for(int i=1; i<=num; i++ )
			
			if (i%2==0)
			System.out.print(i+" ");
			
	}
}

/*
Output: 2 4 6 . . . 100
*/
