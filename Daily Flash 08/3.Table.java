/*
Program 3: Write a Program to print table of 2.
*/

import java.util.Scanner;

class Table {


	public static void main(String[] args){

		System.out.print("Enter Number: ");

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		for(int i=1; i<=10; i++)
			System.out.print((num*i) +" ");
	}
}

/*
Output: 2 4 6 8 10 12 14 16 18 20
*/
