/* Write a Program to find the radius of a circle if the user
provides circumference of that same circle. */

import java.util.Scanner;

class Radius_of_Circle{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Circumference of Circle: ");
		double num = sc.nextDouble();

		int ans = (int) (num/(2*3.142));
		System.out.println("The Radius of the circle is: "+ans);
	}
}
