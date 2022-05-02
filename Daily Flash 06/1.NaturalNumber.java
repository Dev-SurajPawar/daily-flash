/*
Program 1: Write a program to print First 10 Natural Numbers.
*/

import java.util.Scanner;

class Natural_Number {


	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Max Limit: ");

		int num = sc.nextInt();

			System.out.print("Natural Number: ");
			
		for(int i=1; i<=num; i++ )
			System.out.print(i+" ");
			
	}
}

/*
Output: 1 2 3 4 5 6 8 9 10
*/
