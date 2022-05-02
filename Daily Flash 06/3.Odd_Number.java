/*
Program 3: Write a Program to print First 50 Odd Numbers.
*/

import java.util.Scanner;

class Odd_Number {


	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Max Limit: ");

		int num = sc.nextInt();

			System.out.print("Odd Number: ");
			
		for(int i=1; i<=num; i++ )
			
			if(i%2!=0)
			System.out.print(i+" ");
			
	}
}
/*
Output: 1 3 5 . . . 99
*/
