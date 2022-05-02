/*
Program 1: Write a Program to calculate area of circle.
*/

import java.util.*;

class Area {


	public static void main(String[] args){

		System.out.println("Enter Radius: ");
		Scanner sc = new Scanner(System.in);
		double radius = sc.nextDouble();

		double area = (3.14)*((radius)*(radius));

		System.out.println("Area of Circle Radius: "+area);

	}
}

/*
Enter Radius: 
4
Area of Circle Radius: 50.24
*/
