/*
Program 2: Write a Program to Convert entered Decimal Number to Binary Number
*/

import java.util.Scanner;
  
class Decimal_To_Binary {

	    public static void main (String[] args){

		Scanner sc = new Scanner(System.in);    
        	System.out.print("Decimal Number: ");

		int num = sc.nextInt();


        	int[] binaryNum = new int[1000];
        	int i = 0;
        		
		while (num > 0)
		{
            	
			 binaryNum[i] = num % 2;
            		 num = num / 2;
            		 i++;
       		}
        	
		System.out.print("Binary Number: ");

		for (int j = i - 1; j >= 0; j--)
            		System.out.print(binaryNum[j]);


   }
}
 
 /*
Input: DecimalSS Number: 35
Output: Binary Number: 100011 
*/
