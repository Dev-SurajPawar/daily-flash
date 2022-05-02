/*
Program 3: Write a Program to calculate Velocity of particle in the space
having Distance & Time Entered By User.
*/

import java.util.Scanner;

class Velocity {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Distance: ");
		int Distance = sc.nextInt();

		System.out.println("Time: ");
		int Time = sc.nextInt();

			System.out.println("The Velocity of Particle roaming in space is "+(Distance/Time)+"m/s");

	}
}

/*
Input:
Distance: 100 m
Time: 20 sec
Output: The Velocity of a Particle roaming In space is 5m/s.
*/
