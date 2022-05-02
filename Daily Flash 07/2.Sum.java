/*
Program 2: Write a Program that accepts an integer from the user and print
Sum of all numbers up to the entered number.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Sum {


	public static void main(String[] args) throws IOException {

		System.out.println("Enter Number: ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());

		int sum =0;
		for(int i= 1; i<=num; i++)
		{
			sum= sum + i;

		}

		System.out.println("The Sum of Number up to "+ num +" is " +sum);
	}
}

/*
Input: 10
Output: The sum of numbers up to 10 is 55
*/
