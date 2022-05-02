/*
Program 3: Write a Program to Convert the Hours entered by the user into Seconds.
*/

import java.util.Scanner;

class Hours_To_Sec{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Hours");
		int hr = sc.nextInt();

		int sec = hr*3600;

		System.out.println(sec+" seconds");
	}
}

/*
Input: 1hr
Output: 3600 seconds
*/
