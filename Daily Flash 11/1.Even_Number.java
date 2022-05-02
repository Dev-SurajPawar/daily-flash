/*
Program 1: Write a Program to print a series of Even numbers ranging
between two numbers entered by the user.
*/

import java.util.Scanner;

class Even_Number {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Min of Series: ");
		int min = sc.nextInt();

		System.out.println("Max of Series: ");
		int max = sc.nextInt();

				System.out.print("Series of Even Number Ranging between "+min+" & "+max+" is: ");

		for(int i= min; i<=max; i++){

				
			if(i%2==0){

				System.out.print(i+" ");
			}


		}
				
	
	}
}

/*
Input:
Min of Series : 4
Max of Series: 60
Output: Series Of Even Numbers Ranging between 4 & 60 is: 4, 6, 8, . . .,60
*/
