/*
Program 2: Write a Program to Convert entered Decimal Number to
Hexadecimal Number
*/

import java.util.Scanner;

class Decimal_To_Hexadecimal{

      
	public static void main(String args[]){
        
        	char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        
        	Scanner in = new Scanner(System.in);
		
        	System.out.print("Decimal number: ");
        	int dec_num = in.nextInt();
	
		int rem = 0;	
        	String hexdec_num="";
        
        	
		while(dec_num>0)
		{
			rem = dec_num%16;
            		hexdec_num = hex[rem] + hexdec_num;
            		dec_num = dec_num/16;
        	}
        
		System.out.print("Hexadecimal number: "+hexdec_num);         
    	}
}

/*
Input: Decimal Number: 43
Output: Hexadecimal Number: 2B
*/
