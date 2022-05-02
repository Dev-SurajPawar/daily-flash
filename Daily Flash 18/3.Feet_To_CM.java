/*
Program 3: Write a Program to Convert enter distance in feet to centimeters.
*/

import java.util.Scanner;

class Ft_To_Cm{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Distance in Feet: ");
		int num = sc.nextInt();

		int cm = num * 30;

		System.out.println("Equivalent distance for "+num+"ft in cm is "+cm+"cm");
	}
}

/*
Input: Distance in Feet: 6ft
Output: Equivalent distance for 6ft in cm is 180cm.
*/
