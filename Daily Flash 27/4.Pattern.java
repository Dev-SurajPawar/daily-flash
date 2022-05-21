/*
Program 4: Write a Program to Print following Pattern.
        #
      # *
    # * *
  # * * *
*/

import java.util.Scanner;

class Pattern{

	public static void main(String[] args){

		System.out.print("Enter No of Rows And Colms: ");

		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();

		for(int i=0; i<=row; i++)
		{

			char a='#';
			for(int space=(row-1); space>=i; space--)
			{

				System.out.print(" "+" ");
			}
			for(int j=1; j<=i; j++)
			{
			
				System.out.print(a+" ");
				a='*';
			}

			System.out.println();
		}
	}
}
