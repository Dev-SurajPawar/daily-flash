/*
Program 2: Write a Program that accepts Two integers from the user and
prints the series of factorials of all numbers between those two inputs.
*/

import java.util.Scanner;

class Factorial {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number: ");
		int num = sc.nextInt();
				
		
		for(int i= 1; i<=num; i++){
			int temp =1;
			for(int j=1; j<=i; j++)
				 temp =temp*j; 

			System.out.println("Factorial of "+i+" "+temp);


		}
				
	
	}
}

/*
Input: 1 to 5
Output:
Factorial of 1 = 1
.
.
Factorial of 5 = 120
*/
