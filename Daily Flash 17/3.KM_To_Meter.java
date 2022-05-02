/*
Program 3: Write a Program to Convert the entered distance in Kilometer by user into meter.
*/

import java.util.Scanner;

class KM_TO_M {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Distance in KM: ");
		int km = sc.nextInt();

		int m = km*1000;

		System.out.println(km+" KM is equal to "+m+"m");
	}
}

/*
Input: Enter Distance in KM: 1
Output: 1 KM is equal to 1000m
*/
