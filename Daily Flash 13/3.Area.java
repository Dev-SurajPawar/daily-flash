/*
Program 3: Write a Program to take input length and breadth of rectangle
and calculate its area.
*/

import java.util.Scanner;

class Area {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Length: ");
		int length = sc.nextInt();

		System.out.println("Breadth: ");
		int breadth = sc.nextInt();

			System.out.println("Area of Rectangle = "+(length*breadth));

	}
}

/*
Input : 10 20
Output : Area of rectangle = 200
*/
