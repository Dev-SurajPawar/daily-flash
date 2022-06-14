/* Write a Program that takes a number as input from the user
and prints only those digits from that number, which are perfect
divisors of the actual number.  */

import java.util.Scanner;

class Perfect_Divisors{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int num = sc.nextInt();

		int tmp = num;
		while (num!=0)
		{
			int rem=num%10;
			if (num%rem==0)
				System.out.print(rem+" ");
			num/=10;
		}
	}
}

/*
Enter Number: 124
4 2 1
*/
