/*
Program 4: Write a Program to Print following Pattern.
           A3
        B3 A4
     C3 B4 A5
  D3 C4 B5 A6
  
*/
import java.util.Scanner;

class Pattern {

	public static void main(String[] args) {


		System.out.print("Enter No of Rows: ");
		Scanner sc = new Scanner(System.in);
		int num= sc.nextInt();

		
		for(int i=1; i<=num; i++)
		{
			int x = 3;
			int ch = 64+i;

			for(int space=(num-1); space>=i; space--)
			{
				System.out.print("  ");

			}
			for(int j=1; j<=i; j++)
			{
				System.out.print((char)ch+""+x+" ");
				x++;
				ch--;

			}
			
			System.out.println();

		}
	}

}
