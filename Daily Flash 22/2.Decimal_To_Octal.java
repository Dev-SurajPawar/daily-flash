/*
Program 2: Write a Program to Convert entered Decimal Number to Octal Number
*/

import java.util.Scanner;

class Decimal_To_Octal {

      public static void main(String args[]){

        
	    int oct_num[] = new int[100];
        
	    Scanner scan = new Scanner(System.in);	
       
	    System.out.print("Input a Decimal Number: ");
        
	    int dec_num = scan.nextInt();
		

    	    int quot = dec_num;
	    int i =1;
	    while(quot != 0)
	    {
		    oct_num[i++] = quot%8;
		    quot = quot/8;
        
	    }
		
	    System.out.print("Octal number is: ");
       
	    for(int j=i-1; j>0; j--)
	    {
		    System.out.print(oct_num[j]);

    	    }
		System.out.println();
    
      }
}

/*
Input: Decimal Number: 15
Output: Octal Number: 17
*/
