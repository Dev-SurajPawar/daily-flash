/*
Write a Program that takes a number as input from the user
and prints only those digits from that number, which are prime in nature.
*/

import java.util.Scanner;

class Prime_Digit{

	public static void main(String[] args){

		System.out.print("Enter Number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int temp=num;
		
		while(num>0)
		{
			int rem=num%10;
			int flag=0;
			
			if(rem==1)
				break;
			else 
			{
				for(int i=2;i<=rem/2;i++)
				{
					if(rem%i==0)
						flag=1;
				}
			}
		
			if (flag==0)
			System.out.print(rem+" ");

			num=num/10;
		
		}
	}
}

/*
Input: 141
Output: The Prime Digits from the Number 141 is 1, 1.
*/
