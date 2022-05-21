/*
Program 4: Write a Program to Print following Pattern.
 	 	 	 	
 	 	 	100	
 	 	81	64	
 	49	36	25	
16	9	4	1	
*/
import java.util.Scanner;

class Pattern{

	public static void main(String[] args){

		System.out.print("Enter Rows and Colms: ");

		Scanner sc = new Scanner(System.in);
		int row= sc.nextInt();

		int num = 10;
		for(int i=0; i<=row; i++)
		{
			for(int space=(row-1); space>=i; space--)
			{
				System.out.print(" "+"\t");
			}
			for(int j=1; j<=i; j++)
			{
				System.out.print(num*num+"\t");
				num--;
			}

			System.out.println();
		}
	}
}
