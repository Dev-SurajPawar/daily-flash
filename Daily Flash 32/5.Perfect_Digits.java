/* Write a Program that takes a number as input from the user
and prints only perfect digits if it has any other prints appropriate  */

import java.util.Scanner;

class Perfect_Digits{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int num = sc.nextInt();

		while (num!=0)
		{
			num=num%10;
			for(int i=1; i<=num;i++){

				int temp=0;

	        		for(int j=1;j<i;j++){
		
				      if(i%j==0){
		      
		        		temp=temp+j;
		     			}
				}
	              	if(temp==i)
				System.out.print(i+" ");
			}	
			num/=10;
		}
	}
}
