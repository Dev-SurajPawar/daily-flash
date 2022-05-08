

import java.util.Scanner;

class Pattern {

	public static void main(String[] args) {


		System.out.print("Enter No of Rows: ");
		Scanner sc = new Scanner(System.in);
		int num= sc.nextInt();

		for(int i=1; i<=num; i++)
		{
			int x = 9;
			for(int space=(num-1); space>=i; space--)
			{
				System.out.print("   ");

			}
			for(int j=1; j<=i; j++)
			{
				System.out.print(x+" ");
				x=x+9;

			}
			
			System.out.println();

		}
	}

}
