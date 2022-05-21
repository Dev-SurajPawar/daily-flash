/*
Program 5: Write a Program that takes a number as input from the user
and prints the factorials of each digit.
*/

import java.util.Scanner;

class Factorial_Digit{

	public static void main(String[] args){
	
		System.out.print("Enter Number: ");
		Scanner sc = new Scanner(System.in);
		int num= sc.nextInt();

		while(num>0)
		{
			int rem= num%10;
			int temp = rem;
			int fact=1;
			int sum=0;
			while(rem>0)
			{
				fact=fact*rem;
				rem=rem-1;
			}
			
			System.out.println(temp+"Factorial is  "+fact);

			num=num/10;
		}
	}
}

/*
Enter Number: 141
1Factorial is  1
4Factorial is  24
1Factorial is  1

*/
