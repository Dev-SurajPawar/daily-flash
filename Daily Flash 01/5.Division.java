/*
Program 5: Write a Program to check whether the number is divisible by 5 & 11 or not
*/

import java.util.*;

class Division{

	public static void main(String[] args){

		System.out.println("Enter Number: ");
		
		Scanner sc = new Scanner(System.in);

		int x= sc.nextInt();

		if (x%5==0 && x%11==0)
			System.out.println(x+" is Divisible by 5 & 11");
		
		else
			System.out.println(x+" is not Divisible by 5 & 11");

	}
	
}

/*
Input: 55
Output: 55 is divisible by 5 & 11
*/
