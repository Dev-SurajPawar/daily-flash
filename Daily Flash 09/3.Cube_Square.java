/*
Program 3: Write a program that accepts two integers from the user
and prints addition of their Cubes and subtraction of their Squares.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Cube_Square {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Number: ");
		int num1 = Integer.parseInt(br.readLine());
		
		int num2 = Integer.parseInt(br.readLine());

		int num01 = num1*num1*num1;
		int num02 = num2*num2*num2;
		System.out.println("Addition of  "+num01+" & "+num02+" "+ (num01 + num02));

		int num03 = num1*num1;
		int num04 = num2*num2;
		if(num1>num2)
			System.out.println("Subtraction of "+num03+" & "+num04+" "+ (num03 - num04));
		
		else 
			System.out.println("Subtraction of "+num03+" & "+num04+" "+ (num03 - num04));


	}
}

/*
Input: 10 20
Output:
Addition of 1000 & 8000 is 9000
Subtraction of 100 & 400 is -300
*/
