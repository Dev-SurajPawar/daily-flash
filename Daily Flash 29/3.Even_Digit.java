/*
Write a Program that accepts a number from user print multiplication of all Even Digits from that number.
*/

import java.util.Scanner;

class Even_Digit{

	public static void main(String[] args){

		System.out.print("Enter Number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int rem=0;
		int temp=1;
		while(num>0)
		{
			rem=num%10;
			if(rem%2==0)
			{
				temp=temp*rem;
			}
			num=num/10;
			
		}
		System.out.println("The Multiplication of all Even Digits is :"+temp);
	}
}

/*
Input: 1234
Output: The Multiplication of all Even Digits is 8
*/
