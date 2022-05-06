/*
Program 2: Write a Program to Convert entered Decimal Number to Octal Number
*/

import java.util.Scanner;

class Decimal_To_Octal {

      public static void main(String args[]){

        
	    int oct_num[] = new int[100];
        
	    Scanner sc = new Scanner(System.in);	
       
	    System.out.print("Decimal Number: ");
        
	    int dec_num = sc.nextInt();
		

    	    int temp = dec_num;
	    int i =1;
	    while(temp != 0)
	    {
		    oct_num[i++] = temp%8;
		    temp = temp/8;
        
	    }
		
	    System.out.print("Octal number: ");
       
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
