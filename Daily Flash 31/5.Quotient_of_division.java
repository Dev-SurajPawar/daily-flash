/* Write a Program that takes a number as input from the user and
prints the Quotient of division of each digit from that number with the
number itself. */

import java.util.Scanner;

class Quotient_of_division{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int num = sc.nextInt();

		int tmp = num;
		while (num!=0)
		{
			int rem=num%10;
			if (num%rem==0)
				System.out.println(tmp+"/"+rem+"="+tmp/rem);
			num/=10;
		}
	}
}

/*
Enter Number: 124
124/4=31
124/2=62
124/1=124
*/
