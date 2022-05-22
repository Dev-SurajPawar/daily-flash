/*
Write a Program to print the sum of the following series.
Take the limiting factor from the user and print sum up to that element.
Series: 1, 11, 111, 1111, 11111, 111111, 111111 . . .
*/

import java.util.Scanner;

class Sum_Series{

	public static void main(String[] args){

		System.out.print("Enter Number Series: ");

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int sum = 0;
	        int temp = 1;
        	for (int i = 1; i <= num; i++)
        	{
            		sum = sum + temp;
           		temp = (temp * 10) + 1;
        	}
		System.out.print(sum+"\n");

	}	
}

/*
Input: 5
Output: The Sum is: 12345
*/
