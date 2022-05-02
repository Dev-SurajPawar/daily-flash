/*
 * Program 2: Write a program that accepts two integers from the user
and prints multiplication & Division of them.
{Note: checks for smaller divisor amongst entered number while
computing division}
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Multi_Div {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Number: ");
		int num1 = Integer.parseInt(br.readLine());

		int num2 = Integer.parseInt(br.readLine());

		System.out.println("Multipication is "+ (num1 * num2));

		if(num1>num2)
			System.out.println("Division is "+(num1 / num2));

		else
			System.out.println("Division is "+(num2 / num1));


	}
}
/*
Input: 10 20
Output:
Multiplication is 200
Division is 2
*/
