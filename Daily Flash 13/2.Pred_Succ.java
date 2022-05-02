/*
Program 2: Write a Program that accepts an integer from the user and
prints its second successor and second predecessor.
*/

import java.util.Scanner;

class Prod_Succ {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number: ");
		int num = sc.nextInt();
				
			System.out.println("Second Predecessor: "+(num-2));
			System.out.println("Second Successor: "+(num+2));
				
	
	}
}

/*
Input: 50
Output:
Second Predecessor: 48
Second Successor: 52
*/
