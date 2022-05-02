/*
Program 2: Write a Program to convert entered Binary Number to
Hexadecimal Number.
*/

import java.util.Scanner;

class Binary_Hexa {

	public static void main(String[] args){

    		System.out.println("Binary Number: ");

    		Scanner sc = new Scanner(System.in);

    		int num = Integer.parseInt(sc.nextLine(),2);

    		String hexa = Integer.toHexString(num);

    		System.out.println("HexaDecimal Value is : " + hexa);

	}
}

/*
Input:
Output:
Binary Number: 1011
Hexadecimal Number: b
*/
