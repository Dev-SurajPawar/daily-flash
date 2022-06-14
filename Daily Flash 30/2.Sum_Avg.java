/* Write a Program that sums up all the digits from an entered
number and finds the average of that sum and print them both. */

import java.util.Scanner;

class Sum_Avg{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int num = sc.nextInt();

		int tmp = num;
		int sum=0; int count=0; int avg = 0;

		while (num!=0)
		{
			int rem = num%10;
			sum = sum+rem;
			num/=10;
			count+=1;
		}

		System.out.println("Sum of Digits from "+tmp+" : "+sum);
		avg=sum/count;
		System.out.println("Sum of Digits from "+tmp+" : "+avg);
	}
}

/*
Enter Number: 12345
Sum of Digits from 12345 : 15
Sum of Digits from 12345 : 3
*/
