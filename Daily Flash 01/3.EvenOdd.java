/*
Program 3: Write a Program to Find whether the number Is Even or Odd 
*/

import java.util.*;

class EvenOdd{

	public static void main(String[] args){

		System.out.println("Enter Number: ");
		
		Scanner sc = new Scanner(System.in);

		int x= sc.nextInt();

		if (x%2==0)
			System.out.println(x+" is even number");
		
		else
			System.out.println(x+" is odd number");

	}
	
}
/*
Input: 4
Output: 4 is even number
*/:wq
