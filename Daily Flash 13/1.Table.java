/*
Program 1: Write a Program to print table in reverse order.
*/

import java.util.Scanner;

class Table {


	public static void main(String[] args){

		System.out.print("Enter Number: ");

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		for(int i=10; i>=1; i--)
			System.out.println(num+" X "+i+" = "+(num*i));
	}
}

/*
Input : 2
Output :
2 X 10 = 20
2 X 9 = 18
2 X 8 = 16
.
.
2 X 1 = 2
*/
