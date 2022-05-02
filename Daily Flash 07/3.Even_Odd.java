/*
Program 3: Write a Program that accepts an integer from the user and prints
whether that number is odd or even.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Even_Odd {


	public static void main(String[] args) throws IOException {

		System.out.println("Enter Number: ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());

		if(num%2==0)
			System.out.println(num +" is an Even Number");

		else 
			System.out.println(num +" is an Odd Number");
	}
}

/*
Input: 2
Output: 2 is an Even Number
*/
