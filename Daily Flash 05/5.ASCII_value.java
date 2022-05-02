/*
Program 5: Write a program to ASCII values of input character.
*/

import java.util.*;

class ASCII_value {


	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Charactar: ");

		char ch = sc.next().charAt(0);

		int value = (int)ch;
		System.out.println(value);
	}
}

/*
Enter Charactar: 
A
65
*/
