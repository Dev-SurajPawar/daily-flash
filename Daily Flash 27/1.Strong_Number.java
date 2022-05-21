/*
Program 1: Write a Program to print Series of Strong Numbers up to Nth
Elements. Where n is the number entered by User.
*/

import java.util.Scanner;

class Strong_Number{

	public static void main(String[] args){

		System.out.println("Enter Number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

	
		int sum=0;
                int temp = num;

		while(num>0)
		{	
			int rem= num%10;
			int fact=1;
			
			while(rem>0)
			{
				fact=fact*rem;
				rem=rem-1;
			}

			sum = sum+fact;
			num=num/10;

		if(sum==temp)
			System.out.print("Strong Number: "+temp);
		}

		
	}
}
