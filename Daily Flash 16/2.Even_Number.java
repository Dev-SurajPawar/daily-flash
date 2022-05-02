/*
Program 2: Write a Program that prints a series of Even numbers in reverse order from the limiting number entered by the user.
*/

import java.util.Scanner;

class Even_number{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = sc.nextInt();

		for(int i = num ; i>=0; i--)
		{
			if(i%2==0)
				System.out.print(i+" ");
		}
	}
}

/*
Input: 100
Output: 100 98 96 . . .. 0
*/
