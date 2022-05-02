/*
Program 3: Write a Program to print Cubes and Squares of all Even
numbers ranges between given input numbers.
*/

import java.util.Scanner;

class Cube_Square {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number: ");
		int num = sc.nextInt();
				
		
		for(int i= 1; i<=num; i++){

				
			if(i%2==0){

				System.out.println("Cube of "+i+":"+(i*i*i)+" and Square of "+i+":"+(i*i));
			}


		}
				
	
	}
}

/*
Input: 10
Output:
Cube of 2 : 8 and Square of 2 : 4
Cube of 4 : 64 and Square of 4 : 16
.
.Cube of 10 : 1000 and Square of 10 : 100
*/
