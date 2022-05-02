/*
Program 5: Write a Program to print following
Pattern.
0 0 0 0
1 1 1 1
0 0 0 0
1 1 1 1
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Pattern {


	public static void main(String[] args) throws IOException {

		System.out.println("Enter Row: ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int row = Integer.parseInt(br.readLine());

		System.out.println("Enter Colm: ");
		int colm = Integer.parseInt(br.readLine());


		for(int i=1; i<=row; i++)
		{

				if(i%2==0)
					for(int j= 1; j<=colm; j++)

					System.out.print("1 ");

				else 
					for(int j= 1; j<=colm; j++)

					System.out.print("0 ");
			
			System.out.println();
		}
	}
}
