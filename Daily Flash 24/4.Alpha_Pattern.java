/*
Program 4: Write a Program to Print following Pattern.
       A
     B A
   C B A
 D C B A
*/
import java.util.Scanner;

class Alpha_Pattern {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		for(int i=1; i<=num ; i++)
		{
			int x = 64 + i;

			for(int space=num-1; space>=i; space--)
			{
				System.out.print(" "+" ");

			}
						
			for(int j=1; j<=i; j++)
			{
				System.out.print((char)x +" ");
				x--;

			}
			
			System.out.println();

		}
	}
}
