/*
Program 1: Write a program that accepts two integers from the user
and prints addition & Subtraction of them.
{Note: check for greater number to subtract with, while subtracting
numbers}
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class ADD_Sub {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Number: ");
		int num1 = Integer.parseInt(br.readLine());
		
		int num2 = Integer.parseInt(br.readLine());

		System.out.println("Addition is "+ (num1 + num2));

		if(num1>num2)
			System.out.println("Subtraction is "+(num1 - num2));
		
		else 
			System.out.println("Subtraction is "+(num2 - num1));


	}
}

/*
Input: 10 20
Output:
Addition is 20
Subtraction is 10
*/
