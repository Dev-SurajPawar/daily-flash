/* Write a Program to find the circumference of a Circle of
radius entered by the user.{Note: The formula to determine Circumference of Circle is 2πr. Where
π = 3.142}  */

import java.util.Scanner;

class Circumference_of_Circle{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Radius of Circle: ");
		int radius = sc.nextInt();

		double ans = 2*3.142f*radius;
		System.out.println("The circumference of Circle with Radius: "+radius+" is "+ans);
	}
}

/*
Enter Radius of Circle: 40
The circumference of Circle with Radius: 40 is 251.36000061035156
*/
