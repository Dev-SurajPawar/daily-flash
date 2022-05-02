/*
Program 4: Write a Program that accepts an integer from the user and
print a table of that number.
*/

import java.util.Scanner;

class Table_User {


	public static void main(String[] args){

		System.out.print("Enter Number: ");

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		for(int i=1; i<=10; i++)
			System.out.print((num*i) +" ");
	}
}

/*
Input: 4
Output: 4 8 12 16 20 24 28 36 40
*/
