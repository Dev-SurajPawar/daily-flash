/*
Program 2: Write a Program to Convert entered Binary Number to Decimal Number
*/

import java.util.Scanner;
class Binary_To_Decimal{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
	System.out.print("Binary Number: ");
	int binary = sc.nextInt();

	int decimal = 0;  
        int n = 0;  
        	while(true){  
         	 if(binary == 0)
		 {  
            		break;  
          	 } else {  
          
		     	 int temp = binary%10; 
			 decimal += temp*Math.pow(2, n); 
			 binary = binary/10; 
			 n++; 
		 }

		}
        
		System.out.println("Decimal Number: "+decimal);
    }

}

/*
Input: Binary Number: 1011
Output: Decimal Number: 11
*/
