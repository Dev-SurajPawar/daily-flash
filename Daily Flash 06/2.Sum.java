/*
Program 2: Write a Program to print the Sum of First 10 Natural Number
*/

import java.util.Scanner;

class Sum_Number {


	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Max Limit: ");

		int num = sc.nextInt();
			
		int sum = 0;

		for(int i=1; i<=num; i++ )
		
			sum= sum+i;

			System.out.println("Sum: "+sum);
	}
}

/*
Output: Sum: 55
