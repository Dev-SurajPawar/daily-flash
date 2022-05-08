/*Program 4: Write a Program to Print following Pattern.
        3
     3 12
  3  8 15
3 4 10 18 
*/

import java.util.Scanner;

class Number_Pattern {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		for(int i=1; i<=num ; i++)
		{
			for(int space=num-1; space>=i; space--)
			{
				System.out.print(" "+" ");

			}
			
			int x = 3;
			for(int j=1; j<=i; j++)
			{
				System.out.print(x+" ");

			}
			
			System.out.println();

		}
	}
}
