:/*
Program 2: Write a Program to check whether the number is Negative, Positive
or equal to Zero.
*/

import java.util.*;

class Number{

	public static void main(String[] args){

		System.out.println("Enter Number: ");
		
		Scanner sc = new Scanner(System.in);

		int x= sc.nextInt();

		if (x==0)
			System.out.println(x+" is equal to zero");

		else if(x>0)
			System.out.println(x+" is positive number");
		
		else
			System.out.println(x+" is negative number");

	}
	
}

/*
Input: -2
Output: -2 is negative number
*/
