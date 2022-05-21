/*
Program 3: Write a Program to that accepts an integer value from user
and prints the Average of all the digits (addition of digits/number of
digits)
*/

import java.util.Scanner;

class Avg{

	public static void main(String[] args){

		System.out.print("Enter Number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int temp=num;
		int rem=0;
		int sum=0;
		int count=0;
		while(num>0)
		{
			rem=num%10;
			sum=sum+rem;
			num=num/10;
			count++;

		}

		System.out.print("The Average of Digit from Number "+temp+" is "+(double)(sum/count));
	}
}
