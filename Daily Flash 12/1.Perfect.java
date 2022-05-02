/*
Program 1: Write a Program which detects whether the entered number
is perfect or not .
{Note: If the sum of the perfect divisors of a number is equal to the
entered number then it is considered as a perfect one.}
*/

import java.util.Scanner;

class Perfect {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number: ");
		int num = sc.nextInt();

		int temp = 1;		
		for(int i=1; i<=(num/2); i++)
		{

			for(int j=1; j<=i; j++)
				 temp =temp*j; 
		}
			if(temp==num)
				System.out.println(num+" is a Perfect Number");

			else
				System.out.println(num+" is a Not Perfect Number");					
	
	}
}

/*
Input : 6
Output : 6 is a Perfect number.
*/
