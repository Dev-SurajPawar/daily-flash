/*
Program 4: Write a Program to accept 10 integers from the user and print
the sum & average of entered numbers.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Sum_Average {


	public static void main(String[] args) throws IOException {

		System.out.println("Enter Number: ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());

		int sum =0;
		for(int i= 1; i<=num; i++)
		{
			sum= sum + i;

		}

		System.out.println("The Sum of entered Number "+ num +" is " +sum);

		float avg= (sum/num);
		System.out.println("The Average of entered Number "+ num +" is " +(avg));
	
	}
}

/*
Input: 1 2 3 4 5 6 7 8 9 10
Output:
The Sum of 10 entered Numbers is: 55
The Average of 10 entered numbers is: 5.55
*/

