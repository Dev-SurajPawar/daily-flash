/*
Program 5: Write a Program to print sum of series up to the nth entered number. 
Series is: 9, 99, 999, 9999, 9999 . . .. n.
*/

import java.util.Scanner;

class Sum{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Nth Element in series: ");
		int num = sc.nextInt();

		int no = 9, x = 1, sum = 0;
		for(int i = 1; i<=num; i++)
		{
			System.out.print((no*x)+" ");
			sum = sum + (no*x);
			x = (x*10) +1;			
		}
		
		System.out.print("= "+sum);
	}
}

/*
Input: Nth Element in series: 5
Output: the sum of: 9 + 99 + 999 + 9999 + 99999 = 111105
*/
