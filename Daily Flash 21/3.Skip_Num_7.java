/*
Program 3: Write a Program that skips the occurrence of numbers that are divisible by 7 using a continue statement. Print this sequence up to 100.
*/

import java.util.Scanner;

class Skip_Num_7{

	public static void main(String[] args){

		System.out.print("Enter Number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		for(int i=1; i<=num; i++)
		{
			if(i%7!=0)
				System.out.print(i+" ");

		}


	}
}

/*
Output: 1 2 3 4 5 6 8 9 10 11 12 13 15....
*/
