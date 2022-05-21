/*
Program 1: Write a Program to take a number from the user and print
those digits who are prime in nature.
*/

import java.util.Scanner;

class Prime_Num{

	public static void main(String[] args){

		System.out.print("Enter Number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		while(num>0)
		{

			int rem=0;
			rem=num%10;

			int flag=0;
			if(rem==1){
				break;
			}
	
			else{

				for(int i=2;i<=rem/2;i++)
				{
					if(rem%i==0)
					{
						flag=1;
						break;
					}
				}
			}

			if(flag==0)
				System.out.print(rem+" ");

			num=num/10;
		}
	}
}

/*
Enter Number: 16532
2 3 5
*/
