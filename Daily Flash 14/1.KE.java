/*
Program 1: Write a Program that calculates Kinetic Energy of an object
with given Mass & Velocity.
{Note: K.E. = ½ * m * v * v }
*/

import java.util.Scanner;

class KE {


	public static void main(String[] args){

		Scanner sc =  new Scanner(System.in);
		System.out.println("Mass: ");
		int m = sc.nextInt();
		System.out.println("Velocity: ");
		int v = sc.nextInt();

		float KE = ((m)*(v*v)/2);
			System.out.println("Kinetic Energy of That Object is : "+KE);
	
	}
}	

/*
Input: Mass = 53kg Velocity = 5m/s
Output: Kinetic Energy of that Object is: 662.0
*/
