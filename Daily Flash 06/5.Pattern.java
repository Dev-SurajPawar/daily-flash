/*
Program 5: Write a Program to print following Pattern.
0 0 0 0
0 0 0 0
0 0 0 0
0 0 0 0
*/

import java.util.Scanner;

class Pattern {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Row: ");
		int row = sc.nextInt();

		System.out.println("Enter Colm: ");
		int colm = sc.nextInt();

		for(int i=1; i<=row; i++){
			 
			for(int j= 1; j<=colm; j++){
	
				System.out.print(0+" ");
			}

			System.out.println();
		}
			
	}

}
